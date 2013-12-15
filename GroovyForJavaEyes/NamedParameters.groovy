class Robot
{
  def type, height, width

  def access(Map location, weight, fragile)
  {
    println "Received fragile? $fragile, weight: $weight, loc: $location"
  }
}

robot = new Robot(type: 'arm', width: 10, height: 40)

println "$robot.type, $robot.width, $robot.height"

robot.access(50, x: 30, y: 20, z: 10, true)
