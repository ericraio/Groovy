lst = [1, 3, 4, 1, 8, 9, 2, 6]

// no arguments are passed to the closure
// so groovy passes the element to the closure and
// we can reference the element with 'it'
lst.each { println it }

println "----"

total = 0

// adds the current element to the total
// += operator is the same as total = total + it
lst.each { total += it }
println "Total is $total"

println "----"

doubled = []

// << operator is the same ast leftShift()
// I like to call this operator as shovel
// this pushes the element to end of the array

lst.each {
  // doubles the current element
  // and then shovels it into the Array
  doubled << it * 2
}

println doubled

println "----"

// collect operates on each element in a collection 
// and returns the resulting collection
// this simplifies the method above
println lst.collect { it * 2 }

// remains untouched
println lst
