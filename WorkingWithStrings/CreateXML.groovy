// Sets up a map
langs =  [ 'C++' : 'Stroustrup', 'Java' : 'Gosling', 'Lisp' : 'McCarthy' ]

content = ''

// loops through each key-value pair
langs.each { language, author ->
  fragment = """
  <language name="${language}">
    <author>${author}</author>
  </language>
  """

  // concats the fragmentted strings to the end of the context
  content += fragment
}

xml = "<languages>$content</languages>"

println xml
