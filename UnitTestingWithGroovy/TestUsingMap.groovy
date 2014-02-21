import com.agiledeveloper.ClassWithDependency

class TestUsingMap extends GroovyTestCast
{
  void testMethodA()
  {
    def text = ''
    def fileMock = [write: { text = it }}

    def testObj = new ClassWithDependency()
    testObj.methodA(1, fileMock)
    assertEquals "The value is 1.", text
  }
}
