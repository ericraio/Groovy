enum Methodologies
{
  Evo(5),
  Scrum(10),
  XP(21);

  final int daysInIteration
  Methodologies(days) { daysInIteration = days }

  def iterationDetails()
  {
    println "${this} recommends $daysInIteration days for iteration"
  }
}

for(methodology in Methodologies.values())
{
  methodology.iterationDetails()
}
