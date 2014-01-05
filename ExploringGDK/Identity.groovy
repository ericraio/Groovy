lst = [1, 2]

lst.add(3)
lst.add(4)


println lst.size()
println lst.contains(2)

println "----"

lst = [1,2]
lst.identity {
  add(3)
  add(4)

  println size()
  println contains(2)
}

println "----"

lst.identity {
  println "this is ${this},"
  println "owner is ${owner},"
  println "delegate is ${delegate}."
}
