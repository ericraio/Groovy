package com.agiledeveloper

public class ClassWithDependency
{
  def methodA(val, file)
  {
    file.write "the value is ${val}."
  }

  def methodB(val)
  {
    def file = new java.io.FileWrite("output.txt")
    file.write "the value is ${val}"
  }

  def methodC(val)
  {
    def file = new java.io.FileWrite("output.txt")
    file.write "the value is ${val}"
    file.close()
  }
}
