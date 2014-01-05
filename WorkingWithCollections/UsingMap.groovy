// This object is a Linked HashMap
// each key must have a value
// this is not valid -----------> langs = [ 'C++' : 'Stroustrup', 'Java' ]
langs = [ 'C++' : 'Stroustrup', 'Java' : 'Gosling', 'Lisp' : 'McCarthy']

// java.util.LinkedHashMap
println langs.getClass().name

println "----"

// Values can be accessed with the [] operator
println langs['Java']
println langs['C++']

println "----"

// values can also be accessed by using the key like a property

println langs.Java

println "----"

// println langs.C++ this is invalid
// groovy looks for C inside langs then called the next() method from the ++ operator

println "----"

println langs.'C++'


println "----"

langs = [ 'C++' : 'Stroustrup', Java : 'Gosling', Lisp : 'McCarthy']
println langs
