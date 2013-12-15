class Car
{
  final miles = 0

  def getMiles()
  {
    println "getMiles called"
    miles
  }

  // The code below is for groovy <= 1.6
  /*
  def drive(dist)
  {
    if (dist > 0) {
      miles += dist 
    }
  }
  */

}

def car = new Car()

println "Miles: $car.miles"
println "Driving"

try
{
  print "Can I set the miles? "
  car.miles = 12
}
catch(groovy.lang.ReadOnlyPropertyException ex)
{
  println ex.message
}
