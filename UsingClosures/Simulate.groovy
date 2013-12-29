class Equipment
{
  // sets up an property
  def calculator

  // assign the argument of the class to calculator property
  Equipment(calc) { calculator = calc }

  def simulate()
  {
    println "Running Simulation"
    // call the property
    calculator()
  }
}

eq1 = new Equipment({ println "Calculator 1" })

aCalculator = { println "Calculator 2"  }

eq2 = new Equipment(aCalculator)
eq3 = new Equipment(aCalculator)

eq1.simulate()
eq2.simulate()
eq3.simulate()
