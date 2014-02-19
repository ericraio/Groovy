import com.agiledeveloper.CodeWithHeavierDependencies

class TestUsingCategories extends GroovyTestCase
{
  void testMyMethod()
  {
    def testObj = new CodeWithHeavierDependencies()

    use(MockHelper)
    {
      testObj.myMethod()
      assertEquals 35, MockHelper.result
    }
  }
}

class MockHelper
{
  def static result

  def static println(self, text) { test = result }

  def static someAction(CodeWithHeavierDependencies self) { 25 }
}
