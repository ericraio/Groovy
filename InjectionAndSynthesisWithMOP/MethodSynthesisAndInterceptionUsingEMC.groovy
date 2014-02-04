
ExpandoMetaClass.enableGlobally()

class Person
{
  def work() { "working...." }
}

Person.metaClass.invokeMethod = { String name, args ->
  System.out.println " intercepting call for ${name}..."

  def method = Person.metaClass.getMetaMethod(name, args)

  if (method)
  {
    return method.invoke(delegate, args)
  }
  else
  {
    return Person.metaClass.invokeMissingMethod(delegate, name, args)
  }
}

Person.metaClass.methodMissing = { String name, args ->
  def plays = ['Tennis', 'VolleyBall', 'BasketBall']

  System.out.println "methodMissing called for $name"
  def methodInList = plays.find { it == name.split('play')[1] }

  if (methodInList)
  {
    def impl = { Object[] vargs ->
      return "playing ${name.split('play')[1]}..."
    }

    Person.metaClass."$name" = impl // future calls will use this

    return impl(args)
  }
  else
  {
    throw new MissingMethodException(name, Person.class, args)
  }
}


jack = new Person()
println jack.work()
println jack.playTennis()
println jack.playTennis()
