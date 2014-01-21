class MyClass {}

println "MetaClass of 2 is " + 2.metaClass.getClass().name
println "MetaClass of Integer is " + Integer.metaClass.getClass().name
println "MetaClass of 2 now is " + 2.metaClass.getClass().name

obj1 = new MyClass()
println "MetaClass of obj1 is " + obj1.metaClass.getClass().name
println "MetaClass of MyClass is " + MyClass.metaClass.getClass().name
println "MetaClass of obj1 now is " + obj1.metaClass.getClass().name

obj2 = new MyClass()
println "MetaClass of obj2 created later is " + obj2.metaClass.getClass().name
