class Handler
{
  def f1() { println "f1 of Handler called..."  }
  def f2() { println "f2 of Handler called..."  }
}

class Example
{
  def f1() { println "f1 of Example called..."  }
  def f2() { println "f2 of Example called..."  }

  def foo(closure)
  {

    // the closure is delegated to pass methods to Handler
    closure.delegate = new Handler()
    // when calling the closure it calls the f2 method on handler
    closure()
  }
}

def f1() { println "f1 of Script called..." }

new Example().foo {
  // calls the f1 method within the same scope as 'new Example()'
  f1()
  f2()
}
