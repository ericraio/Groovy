Integer.metaClass.getDays = { ->
  delegate
}

Integer.metaClass.getAgo = { ->
  def date = Calendar.instance
  date.add(Calendar.DAY_OF_MONTH, -delegate)
  date
}

Calendar.metaClass.at = { Map time ->
  def hour = 0
  def minute = 0
  time.each { key, value ->
    hour = key.toInteger()
    minute = value.toInteger()
  }

  delegate.set(Calendar.HOUR_OF_DAY, hour)
  delegate.set(Calendar.MINUTE, minute)
  delegate.set(Calendar.SECOND, 0)
  delegate.time
}

try {
  println 2.days.ago.at(4:30)
} catch(Exception ex) { println ex }
