def examine(closure)
{
  println "$closure.maximumNumberOfParameters parameter(s) given:"
  // loops through all parameter types in the closure and prints its name
  for(aParameter in closure.parameterTypes) { println aParameter.name }

  println "--"
}

// no parameters passed, defaults to 1 parameter to it
// it defaults to null if no parameters were passed
examine() { }
examine() { it }

// -> syntax is used if you want the closure to not use any parameters at all
examine() { ->  }

examine() { val1 -> }
examine() { Date val1 -> }
examine() { Date val1, val2 ->  }
examine() { Date val1, String val2 ->}
