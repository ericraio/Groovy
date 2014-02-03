ExpandoMetaClass.enableGlobally()

class Person implements GroovyInterceptable
{
	def work() { "working..." }
	def plays= ['Tennis', 'VolleyBall', 'BasketBall']

	def invokeMethod(String name, args)
	{
		System.out.println "intercepting call for $name"

		def method = metaClass.getMetaMethod(name, args)
		if(method)
		{
			return method.invoke(this, args)
		}
		else
		{
			return metaClass.invokeMethod(this, name, args)
		}
	}

	def methodMissing(String name, args)
	{
		System.out.println "methodMissing called for $name"
		def methodInList = plays.find { it == name.split('play')[1] }
		if(methodInList)
		{
			def impl = { Object[] vargs ->
				return "playing ${name.split('play')[1]}..."
			}

			Person.metaClass."${name}" = impl // future calls will use this

			return impl(args)
		}
		else
		{
			throw new MissingMethodException(name, Person.class, args)
		}
	}
}

jack = new Person()
println jack.work()
println jack.playTennis()
println jack.playTennis()
