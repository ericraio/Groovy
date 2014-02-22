import com.agiledeveloper.ClassWithDependency

class TestMethodCUsingMock extends GroovyTestCase
{
	void testMethodC()
	{
		def testObj = new ClassWithDependency()

		def fileMock = new groovy.mock.interceptor.MockFor(java.io.FileWriter)
		def test
		fileMock.demand.write { text = it.toString() }
		fileMock.demand.close {}

		fileMock.use
		{
			testObj.methodC(1)
		}

		assertEquals "The value is 1.", text
	}
}
