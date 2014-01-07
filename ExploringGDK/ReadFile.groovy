println new File('thoreau.txt')

println "----"

println new File('thoreau.txt').eachLine { line ->
  println line
}

println "----"

println new File('thoreau.txt').filterLine { it =~ /life/ }
