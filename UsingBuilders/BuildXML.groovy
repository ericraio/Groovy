langs = [ 'C++' : 'Stroustrup', 'Java' : 'Gosling', 'Lisp' : 'McCarthy' ]

writer = new StringWriter()
bldr = new groovy.xml.MarkupBuilder(writer)

build.languages {
  langs.each { key, value ->
    language(name: key) {
      author (value)
    }
  }
}

println writer
