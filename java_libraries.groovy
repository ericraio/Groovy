// Creates a Greet Class
class Greet {
  // defines a name function
  def name
  Greet(who) { name = who[0].toUpperCase() +
                      who[1..-1] }

  def salute() { println "Hello $name!" }
}

import static org.apache.commons.lang.WordUtils.*

class Greeter extends Greet {
  Greeter(who) { name = capitalize(who) }
}

new Greeter('world').salute()
