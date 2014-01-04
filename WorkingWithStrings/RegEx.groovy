// ~"" creates an instance of Pattern
obj = ~"hello"

println obj.getClass().name


println "----"

// initializes a Pattern object
pattern = ~"(G|g)roovy"
text = 'Groovy is Hip'

// =~ performs a partial match
if (text =~ pattern)
  println "match"
else
  println "no match"

// Performs a RegEx exact match
if (text ==~ pattern)
  println "match"
else
  println "no match"

println "----"

// =~ operator returns a matcher object, which is an instance of
// java.util.regex.Matcher
// since this expression below matches 2, the expression returns an array of the matched
// strings
matcher = 'Groovy is groovy' =~ /(G|g)roovy/
print "Size of matcher is ${matcher.size()} "
println "with elements ${matcher[0]} and ${matcher[1]}"

println "----"
str = 'Groovy is groovy, really groovy'
println str

// the expression returns a Matcher object, replaceAll replaces all
// the matches and returns the string that was being matched against
// with the updated values
result = (str =~ /groovy/).replaceAll('hip')
println result
