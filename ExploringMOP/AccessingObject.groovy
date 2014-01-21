def printInfo(obj)
{
  usrRequestedProperty = 'bytes'
  usrRequestedMethod = 'toUpperCase'

  println obj[usrRequestedProperty]

  println obj."$usrRequestedMethod"

  println obj."$usrRequestedProperty"()

  println obj.invokeMethod(usrRequestedMethod, null)
}

printInfo('hello')

println "----"

println "Properties of 'hello' are: "
'hello'.properties.each { println it }
