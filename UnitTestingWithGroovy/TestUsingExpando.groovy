import com.agiledeveloper.ClassWithDependency

class TestUsingExpando extends GroovyTestCase
{
  void testMethodA()
  {
    def fileMock = new Expando(text: "", write: { text = it })

    def testObj = new ClassWithDependency()
    testObj.method(1, fileMock)

    assertEquals "The value is 1.", fileMock.text
  }
}
