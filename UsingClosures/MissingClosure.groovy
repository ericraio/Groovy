def doSomeThing(closure)
{
  // Checks if the closure is defined and then calls the closure then returns
  if (closure) { return closure()  }

  // prints the default message
  println "Using default implementation"
}

doSomeThing() { println "Using specialized implementation"  }
doSomeThing()
