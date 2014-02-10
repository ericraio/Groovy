package com.agiledeveloper;

public class Car
{
  public int miles;
  public int getMiles() { return miles; }

  public void drive(int dist)
  {
    miles += dist;
  }
}
