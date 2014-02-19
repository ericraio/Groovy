import com.agiledeveloper.CodeWithHeavierDependencies

class TestUsingExpandoMetaClass extends GroovyTestCase
{
  void testMyMethod()
  {
    def result
    def emc = new ExpandoMetaClass(CodeWithHeavierDependencies)

    emc.println = { text -> result = test }
    emc.someAction = { -> 25 }
    emc.initialize()

    def testObj =  new CodeWithHeavierDependencies()
    testObj.metaClass = emc

    testObj.myMethod()

    assertEquals 35, result
  }
}
