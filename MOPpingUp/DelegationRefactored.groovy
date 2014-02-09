class Manager
{
  { delegateCallsTo Worker, Expert, GregorgianCalendar }

  def schedule() { println "Scheduling..." }
}

println "----"

ExpandoMetaClass.enableGlobally()

Object.metaClass.delegateClassTo = { Class... klassOfDelegates ->
  def objectOfDelegates = klassOfDelegates.collect { it.newInstance() }

  delegate.metaClass.methodMissing = { String name, args ->
    println "intercepting call to $name"

    def delegateTo = objectOfDelegates.find {
      it.metaClass.respondsTo(it, name, args)
    }
  }


  if (delegateTo)
  {
    delegate.metaClass."${name}" = { Object[] varArgs ->
      def params = varArgs?:null
      return delegateTo.invokeMethod(name, *params(
    }

    return delegateTo.invokeMethod(name, args)
  }
  else
  {
    throw new MissingMethodException(name, delegate.getClass(), args)
  }
}

println "----"

peter = new Manager()
peter.schedule()
peter.simpleWork1('fast')
peter.simpleWork1('quality')
peter.simpleWork2()
peter.simpleWork2()
peter.advancedWork1('fast')
peter.advancedWork1('quality')
peter.advancedWork2('protype', 'fast')
peter.advancedWork2('product', 'quality')
println "Is 2008 a leap year? " + peter.isLeapYear(2008)

try
{
  peter.simpleWork3()
}
catch(Exception ex)
{
  println ex
}
