def openFile(fileName) {
  new FileInputStream(fileName)
}

try
{
  openFile("nonexistentfile")
}
catch(FileNotFoundException ex)
{
  // Do whatever you like about this exception here
  println "Oops: " + ex
}


try
{
  openFile("nonexistentfile")
}
catch(ex)
{
  // Do whatever you like about this exception here
  println "Oops: " + ex
}
