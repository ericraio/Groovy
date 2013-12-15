enum WeekendActivity
{
  SATURDAY {
    String activity() { 'Play' } // Error, does not work
  },
  SUNDAY;

  String activity() { 'Relax' }
}

for(day in WeekendActivity.values())
{
  println "$day - ${day.activity()}"
}
