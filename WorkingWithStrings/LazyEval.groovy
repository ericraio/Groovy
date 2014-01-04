// what references a StringBuffer object
// class java.lang.StringBuffer
what = new StringBuffer('fence')

// text referencing a GString and within the GString it references the what var
text = "The cow jumped over the $what"
println text

// replaces the context within the object
what.replace(0, 5, "moon")
println text

println "-----"

price = 568.23
company = "Google"

// quote references a GString, the GString references the var price and company
quote = "Today $company stock closed at $price"
println quote

stocks = [Apple: 130.01, Microsoft: 36.95]
stocks.each { key, value ->
  company = key
  price = value

  // reassigning company and price doesn't change where the GString is referencing
  println quote
}

println "-----"

price = null
company = null

// when no arguments are passed then 
// the closure takes one argument
// it references the first argument, 
// writes to the closure the variables
companyClosure = { it.write(company) }
priceClosure = { it.write("$price") }

// GString references the closures
quote = "Today ${companyClosure} stock closed at ${priceClosure}"
stocks = [Google: 568.23, Apple: 130.01, Microsoft: 36.95]

stocks.each { key, value ->
  company = key
  price = value
  println quote
}

println "-----"

price = null
company = null

// using the -> syntax tells the closure that it takes no parameters,
// the GString uses what is returned.
companyClosure = { -> company } // returns company
priceClosure = { -> price } // returns price

// The GString that references two closures
quote = "Today ${companyClosure} stock closed at ${priceClosure}"

stocks.each { key, value ->
  company = key
  price = value
  println quote
}

println "-----"

price = null
company = null

// instead of defining a new closure, you can simple just use the -> syntax
// within the GString
quote = "Today ${-> company} stock closed at ${-> price}"

stocks.each { key, value ->
  company = key
  price = value
  println quote
}
