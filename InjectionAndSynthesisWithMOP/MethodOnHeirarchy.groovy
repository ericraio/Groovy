Integer.metaClass
Long.metaClass
// Above statements will not be needed if
// ExpandoMetaClass was the default MetaClass
// in Groovy

Number.metaClass.someMethod = { ->
  println "someMethod called"
}

2.someMethod()
2L.someMethod()
