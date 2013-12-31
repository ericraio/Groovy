def tellFortunes(closure)
{
  Date date = new Date("11/15/2007")

  // closure date, "Your day is filled with ceremony"
  // closure date, "They're features, not bugs"
  // You can curry to avoid sending date repeatedly

  // call curry on the closure passing in the date object
  postFortune = closure.curry(date)

  // call postFortune twice passing in a different string twice
  postFortune "Your day is filled with ceremony"
  postFortune "They're features, not bugs"
}

tellFortunes() { date, fortune ->
  println "Fortune for ${date} is '${fortune}'"
}
