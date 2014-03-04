bldr = new RobotBuilder()

def robot = bldr.robot('iRobot') {
  forward(dist: 20)
  left(rotation: 90)
  forward(speed: 10, duration: 5)
}

robot.go()

//def robotBldr = new RobotBuilder()
//robotBldr.robot('brobot') {
  //forward(dist: 20) {}
//}

class RobotBuilder extends FactoryBuilderSupport
{
  {
    registerFactory('robot', new RobotFactory())
    registerFactory('forward', new ForwardMoveFactory())
    registerFactory('left', new LeftTurnFactory())
  }
}

class Robot
{
  String name
  def movements = []

  void go()
  {
    println "Robot $name operating..."

    movements.each { movement -> println movement }
  }
}

class ForwardMove
{
  def dist
  String toString() { "move distance...$dist" }
}

class LeftTurn
{
  def rotation
  String toString() { "turn left.... $rotation degrees" }
}

class RobotFactory extends AbstractFactory
{
  def newInstance(FactoryBuilderSupport builder, name, value, Map attributes)
  {
    new Robot(name: value)
  }
}

class ForwardMoveFactory extends AbstractFactory
{
  boolean isLeaf() { true }

  def newInstance(FactoryBuilderSupport builder, name, value, Map attributes)
  {
    new ForwardMove()
  }

  boolean onHandleNodeAttributes(FactoryBuilderSupport builder, Object node, Map attributes)
  {
    if (attributes.speed && attributes.duration)
    {
      node.dist = attributes.speed * attributes.duration
      attributes.remove('speed')
      attributes.remove('duration')
    }

    true
  }
}

class LeftTurnFactory extends AbstractFactory
{
  boolean isLeaf() { true }
  def newInstance(FactoryBuilderSupport builder, name, value, Map attributes)
  {
    new LeftTurn()
  }
}
