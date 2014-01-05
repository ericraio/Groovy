class Car
{
  int miles, fuelLevel
}

car = new Car(fuelLevel: 80, miles: 25)

properties = ['miles', 'fuelLevel']
// the above list may be populated from some input or
// may come from a dynamic form in a web app

// print the values
properties.each { name ->
  println "$name = ${car[name]}"
}

// using [] operator allows you to get or set
// a property on object indirectly.
car[properties[1]] = 100

println "fuelLevel now is ${car.fuelLevel}"
