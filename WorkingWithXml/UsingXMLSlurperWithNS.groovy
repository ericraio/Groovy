languages = new XmlSlurper().parse('WorkingWithXml/computerAndNaturalLanguages.xml').declareNamespace(human: 'Natural')

print "Languages: "
println languages.language.collect { it.@name }.join(', ')

print "Natural Languages: "
println languages.'human:language'.collect { it.@name }.join(', ')
