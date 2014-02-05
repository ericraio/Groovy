try {
  carA = new Expando()
  carB = new Expando(year: 2007, miles: 0)

  carA.year = 2007
  carA.miles = 10

  println "carA: " + carA
  println "carB: " + carB
}
catch (ex) {
}

println "----"

car = new Expando(year: 2007, miles: 0, turn: { println "turning..." })
car.drive = {
  miles += 10
  println "$miles miles driven"
}

car.turn()
