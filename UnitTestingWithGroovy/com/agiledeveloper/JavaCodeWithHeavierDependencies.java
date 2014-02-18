package com.agiledeveloper;

public class JavaCodeWithHeavierDependencies
{
  public int someAction()
  {
    try
    {
      Thread.sleep(5000); // simulated time consuming action
    }
    catch(InterruptedException ex) {}

    return (int) (Math.random() * 100); // simulated result of some action
  }

  public void myMethod()
  {
    int value = someAction() + 10;

    System.out.println(value);
  }
}
