println "In Script3"

binding1 = new Binding()
binding1.setProperty('name', 'Venkat')

shell = new GroovyShell(binding1)
shell.evaluate(new File('Script1a.groovy')


