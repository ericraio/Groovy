lst = [1, 3, 4, 1, 8, 9, 2, 6]
println lst

// java.util.ArrayList
println lst.getClass().name

// 0 based index, uses [] operator to fetch the element
println lst[0]

// gets the total size of the array,
// subtracts 1 number to get the last element
println lst[lst.size() - 1]

println "----"

// Groovy gives you negative index values
// to fetch the end of the array
println lst[-1]
println lst[-2]

println "----"

// Groovy allows you to use a range to 
// fetch a section of the array
println lst[2..5]


println "----"

// Groovy also lets you use negative index in the range
println lst[-6..-3]


println "----"

// subLst references the same array as Lst
// with an offset and size amount
subLst = lst[2..5]
println subLst.dump()

println "\n"

// when changing an element in one list, you change both
subLst[0] = 55
println "After subLst[0]=55 lst = $lst"
