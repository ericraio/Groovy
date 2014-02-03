class Person
{
	def work() { "working..." }
	def plays= ['Tennis', 'VolleyBall', 'BasketBall']

	def methodMissing(String name, args)
	{
		System.out.println "methodMissing called for $name"
		def methodInList = plays.find { it == name.split('play')[1] }
		if (methodInList)
		{
			return "playing ${name.split('play')[1]}..."
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
println jack.playBasketBall()
println jack.playVolleyBall()
println jack.playTennis()

try
{
	jack.playPolitics()
}
catch(Exception ex)
{
	println "Error: " + ex
}

println "----"


class PersonTwo
{
	def work() { "working..." }
	def plays= ['Tennis', 'VolleyBall', 'BasketBall']

	def methodMissing(String name, args)
	{
		System.out.println "methodMissing called for $name"
		def methodInList = plays.find { it == name.split('play')[1] }

		if (methodInList)
		{
			def impl = { Object[] vargs ->
				return "playing ${name.split('play')[1]}...."
			}

			Person.metaClass."$name" = impl

			return impl(args)
		}
		else
		{
			throw new MissingMethodException(name, Person.class, args)
		}
	}

	static { Person.metaClass }
}

jack = new PersonTwo()

println jack.work()
println jack.playTennis()
println jack.playBasketBall()
println jack.playVolleyBall()
println jack.playTennis()

try
{
	jack.playPolitics()
}
catch(Exception ex)
{
	println "Error: " + ex
}
