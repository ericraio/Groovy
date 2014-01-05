lst = ['Programming', 'In', 'Groovy']

count = 0

// adds the character count of the string to
// the count value
lst.each { count += it.size() }

println count

println "----"

// collect goes through each element of the array,
// calculates the size of the string and returns an array
// of integers, then the sum method of the array adds up all the integers
// and returns the total
println lst.collect { it.size() }.sum()

println "----"

// Groovy's inject is the same as Ruby's inject
// 0 is the base value for carryOver, adds the value to the element
// size, when the iterator is complete, inject returns the total sum
println lst.inject(0) { carryOver, element -> carryOver + element.size() }


println "----"

// joins the array to a string, space delimited
println lst.join(' ')

println "----"

// replaces the first element of the array with another array
lst[0] = ['Be', 'Productive']
println lst

println "----"

// flattens mutli-dimensional arrays into one array
lst = lst.flatten()
println lst

println "----"

// the array on the left of the '-' operand gets the elements removed from
// the matching elements of the array on the right of the '-' operand
println lst - ['Productive', 'In'] // returns [Be, Groovy]

println "----"

// this returns 4
println lst.size()

// because of the influence of '*' on each element
// this calls size of each element of the array and
// returns a new array of integers
// this is similar to Ruby's
// lst.map(&:size) but better because you can pass an argument
// lst*.join(' ')
println lst*.size()

println "----"

def words(a, b, c, d)
{
  println "$a $b $c $d"
}

// the '*' (spread operator) operand splits the collection 
// into individual objects, this function works only if the 
// array 'lst' has the same amount of elements as the 
// 'words' method's parameters
words(*lst)
