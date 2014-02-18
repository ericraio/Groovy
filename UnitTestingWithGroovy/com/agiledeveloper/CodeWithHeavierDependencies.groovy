package com.agiledeveloper

public class CodeWithHeavierDependencies
{
  public void myMethod()
  {
    def value = someAction() + 10

    println(value)
  }

  int someAction()
  {
    Thread.sleep(5000) // simulates time consuming action

    return Math.random() * 100 // simulated result of some action
  }
}
