class TestMethodInvocation extends GroovyTextCase
{
  void testMethodCallonPOJO()
  {
    def val = new Integer(3)
    assertEquals "3". val.toString()
  }

  void TestInterceptedMethodCallonPOJO()
  {
    def val = new Integer(3)

    Integer.metaClass.toString { -> 'intercepted' }
    assertEquals "intercepted", val.toString()
  }

  void TestInterceptableCalled()
  {
    def obj = new AnInterceptable()

    assertEquals 'intercepted', obj.existingMethod()
    assertEquals 'intercepted', obj.nonExistingMethod()
  }

  void TestInterceptedExistingMethodCalled()
  {
    AGroovyObject.metaClass.existingMethod2 = { -> 'intercepted' }
    def obj = new AGroovyObject()

    assertEquals 'intercepted', obj.existingMethod2()
  }

  void TestUnInterceptedExistingMethodCalled()
  {
    def obj = new AGroovyObject()
    assertEquals 'existingMethod', obj.existingMethod
  }

  void TestPropertThatIsClosureCalled()
  {
    def obj = new AGroovyObject()

    assertEquals 'closure called', obj.closureProp()
  }

  void TestMethodMethodMissingCalledOnlyForNonExistent()
  {
    def obj = new ClassWithInvokeAndMissingMethod()
    assertEquals 'existingMethod', obj.existingMethod()
    assertEquals 'invoke called', obj.nonExistingMethod()
  }

  void TestInvokeMethodCalledForOnlyNonExistent()
  {
    def obj = new ClassWithInvokeOnly()

    assertEquals 'existingMethod', obj.existingMethod()
    assertEquals 'invoke', obj.nonExistingMethod()
  }

  void TestMethodFailsOnNonExistent()
  {
    def obj = new TestMethodInvocation()
    shouldFail (MissingMethodException) { obj.nonExistingMethod()  }
  }
}

class AnInterceptable implements GroovyInterceptable
{
  def existingMethod() {}
  def invokeMethod(String name, args) { 'intercepted' }
}

class AGroovyObject
{
  def existingMethod() { 'existingMethod'  }
  def existingMethod2() { 'existingMethod2'  }
  def closureProp = { 'closure called' }
}

class ClassWithInvokeAndMissingMethod
{
  def existingMethod() { 'existingMethod'  }
  def invokeMethod(String name, args) { 'invoke called' }
  def methodMissing(String name, args) { 'missing called' }
}

class ClassWithInvokeOnly
{
  def existingMethod() { 'existingMethod' }
  def invokeMethod(String name, args) { 'invoke called' }
}
