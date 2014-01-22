class StringUtil
{
  def static toSSN(self) // write toSSN(String self) to restrict to String
  {
    if (self.size() == 9)
    {
      return "${self[0..2]}-${self[3..4]}-${self[5..8]}"
    }
  }
}

use(StringUtil)
{
  println "123456789".toSSN()
  println new StringBuffer("987654321").toSSN()
}

try
{
  println "123456789".toSSN()
  println new StringBuffer("987654321").toSSN()
}
catch(MissingMethodException ex)
{
  println ex.message
}

println "----"

class FindUtil
{
  def static extractOnly(String self, closure)
  {
    def result = ''
    self.each {
      if (closure(it)) { result += it }
    }

    result
  }
}

use(FindUtil)
{
  println "121254123".extractOnly { it == '4' | it == '5' }
}

println "----"

use(StringUtil, FindUtil)
{
  str = "123487651"
  println str.toSSN()
  println str.extractOnly { it == '8' || it == '1' }
}

println "----"

class Helper
{
  def static toString(String self)
  {
    def method = self.metaClass.methods.find { it.name == 'toString' }
    '!!' + method.invoke(self, null) + '!!'
  }
}

use(Helper) {
  println 'hello'.toString()
}
