def isPalindrome(str) { str == str.reverse() }
println "mom is palindrome? ${isPalindrome('mom')}"

def isPalindrome2(str)
{
  if (str)
  {
    str == str.reverse()
  }
  else
  {
    false
  }
}

println "mom is palindrome? ${isPalindrome2('mom')}"
