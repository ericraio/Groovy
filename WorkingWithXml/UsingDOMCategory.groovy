// uses the dom builder to parse languages.xml
document = groovy.xml.DOMBuilder.parse(new FileReader('WorkingWithXml/languages.xml'))

rootElement = document.documentElement

use(groovy.xml.dom.DOMCategory)
{
  println "Languages and authors"
  // gets all the languages rootElement.language
  languages = rootElement.language

  // iterates over each language
  languages.each { language ->
    // uses the '@' syntax to print the name and uses the dot notation to access
    // an array of content
    println "${language.'@name'} authored by ${language.author[0].text()}"
  }

  def languagesByAuthor = { authorName ->

    // uses findAll and the closure to find the authorname
    languages.findAll { 
      it.author[0].text() == authorName
     }.collect { // uses collect to group the languages by their name
      it.'@name'
    }.join(', ') // joins the languages
  }

  println "Languages by Wirth: ${languagesByAuthor('Wirth')}"
}
