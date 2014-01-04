lst = [4, 3, 1, 2, 4, 1, 8, 9, 2, 6]

// find iterates over each element of the array until
// the closure returns true then returns the first occurence
// this is similar to Ruby's Select
println lst.find { it == 2 }

println "----"

// the expression evaluates to true
// when the lst iterates to 8 and returns 8
println lst.find { it > 4 }


println "----"

// the findAll method behaves like the collect method
// because it will return an array of all the matches
println lst.findAll { it == 2 }

println "----"

// finds all the elements in the array that the closure evaluates to true
// and returns an array of the matching elements
println lst.findAll { it > 4 }
