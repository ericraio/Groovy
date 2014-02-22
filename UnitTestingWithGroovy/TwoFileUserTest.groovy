class TwoFileUserTest extends GroovyTestCase
{
	void testUseFiles()
	{
		def testObj = new TwoFileUser()
		def testData = "Multi Files"
		def fileMock = new groovy.mock.interceptor.MockFor(java.io.FileWriter)
		fileMock.demand.write() { assertEquals testData, it }
		fileMock.demand.write() { assertEquals testData.size(), it }
		fileMock.demand.close(2..2) {}

		fileMock.use
		{
			testObj.useFIles(testData)
		}
	}
}
