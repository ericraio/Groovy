langs = [ 'C++' : 'Stroustrup', 'Java' : 'Gosling', 'Lisp' : 'McCarthy']

langs.each { entry ->
  println "Language $entry.key was authored by $entry.value"
}

println "----"

langs.each { language, author ->
  println "Language $language was authored by $author"
}

println "----"

// collect passes the key and value to the closure
// we replace the + with a P and then returns an array
// of elements that was returned from the closure
println langs.collect { language, author ->
  language.replaceAll('[+]', 'P')
}

println "----"

println "Looking for the first language with name greater than 3 characters"

// evaluates each key-value pair and returns the first
// key-value pair that was evaluated to true as a
// java.util.LinkedHashMap$Entry object
entry = langs.find { language, author ->
  language.size() > 3
}

println "Found $entry.key written by $entry.value"

println "----"

println "Looking for all languages with name greater than 3 characters"

// evaluates each key-value pair and returns the all the
// key-value pairs that was evaluated to true as a
// java.util.LinkedHashMap$Entry object
selected = langs.findAll { language, author ->
  language.size() > 3
}
selected.each { key, value ->
  println "Found $key written by $value"
}

println "----"

print "Does any language name have a nonalphabetic character? "
// the any method returns a boolean value if the closure evaluates to true or false once
println langs.any { language, author ->
  language =~ "[^A-Za-z]"
}

println "----"

// the every method returns true only if the closure evaluates to true for all the elements
// otherwise the every method returns false
print "Do all language names have a nonalphabetic character? "
println langs.every { language, author ->
  language =~ "[^A-Za-z]"
}

println "----"

friends = [ 
  "Brian Goestz",
  "Brian Sletten",
  "David Bock",
  "David Geary",
  "Scott Davis",
  "Scott Leberknight",
  "Stuart Halloway"
]

// groupBy groups together the elements by the value that was returned in the closure
// the value being returned in this closure below is the first name
groupByFirstName = friends.groupBy { it.split(' ')[0] }
groupByFirstName.each { firstName, buddies ->
  println "$firstName : ${buddies.join(' ')}"
}
