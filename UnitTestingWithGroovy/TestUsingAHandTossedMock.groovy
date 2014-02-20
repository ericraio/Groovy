import com.agiledeveloper.ClassWithDependency

class TestWithExpando extends GroovyTestCase
{
  void testMethodA()
  {
    def testObj = new ClassWithDependency()
    def fileMock = new HandTossedFileMock()
    testObj.method(1, fileMock)

    assertEquals "The value is 1.", fileMock.result
  }
}

class HandTossedFileMock
{
  def result

  def write(value) { result = value }
}
