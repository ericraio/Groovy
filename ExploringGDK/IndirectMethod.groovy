class Person
{

  // 3 overloading methods
  def walk() { println "Walking..."  }
  def walk(int miles) { println "Walking $miles miles..."  }
  def walk(int miles, String where) { println "Walking $miles miles $where..."  }
}

peter = new Person()

// using the invoke method allows the
// you to call a method with a string, similar to Ruby's send method
peter.invokeMethod('walk', null)
peter.invokeMethod('walk', 10)
peter.invokeMethod('walk', [2, 'uphill'] as Object[])
