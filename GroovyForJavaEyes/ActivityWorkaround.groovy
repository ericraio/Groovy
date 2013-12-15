enum WeekendActivity
{
  SATURDAY, SUNDAY;

  String activity() { 'Relax' }
}


def emc = new ExpandoMetaClass(WeekendActivity)
emc.activity = {-> 'Play' }
emc.initialize()
WeekendActivity.SATURDAY.metaClass = emc


for(day in WeekendActivity.values())
{
  println "$day - ${day.activity()}"
}
