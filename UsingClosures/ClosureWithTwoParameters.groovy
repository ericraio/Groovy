def tellFortune(closure)
{
  closure(new Date("12/28/2013"), "Your day is filled with ceremony")
}

tellFortune() { date, fortune ->
  println "Fortune for ${date} is '${fortune}'"
}


// Groovy supports optional typing
tellFortune() { Date date, fortune ->
  println "Fortune for ${date} is '${fortune}'"
}
