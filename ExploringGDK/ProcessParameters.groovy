// an array of string containing commands
String[] command = ['groovy', '-e', 'print "Groovy!"']

println "Calling ${command.join(' ')}"

// executes the command and returns the text from the process
println command.execute().text
