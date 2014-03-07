value = 0
def clear() { value = 0 }
def add(number) { value += number }
def total() { println "Total is $value" }

clear()
add 2
add 5
add 7
total()


println "----"


try {
  total
} catch(Exception ex) {
  println ex
}
