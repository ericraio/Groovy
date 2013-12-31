def completeOrder(amount, taxComputer)
{
  tax = 0
  // maximumNumberOfParameters is the amount
  // of parameters passed into taxComputer
  if (taxComputer.maximumNumberOfParameters == 2)
  { // expects tax rate
    tax = taxComputer(amount, 6.05)
  }
  else
  { // uses a default rate
    tax = taxComputer(amount)
  }

  println "Sales tax is ${tax}"
}

completeOrder(100) { it * 0.0825 }
completeOrder(100) { amount, rate -> amount * (rate/100) }
