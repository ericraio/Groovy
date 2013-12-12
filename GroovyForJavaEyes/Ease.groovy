/*
  The ? operator calls the method on the value if the value isn't null
*/
def foo(str) {

  // if (str != null) { return str.reverse() }

  println str?.reverse()
}

foo('evil')
foo(null)
