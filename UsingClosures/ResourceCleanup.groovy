class Resource
{
  // sets up some basic methods
  def open() { print "opened..." }
  def close() { print "closed" }
  def read() { print "read..." }
  def write() { print "write..." }

  // creates a class level method that takes 1 argument named closure
  def static use(closure)
  {
    // initializes a new resource object
    def r = new Resource()
    try
    {
      // attempts to open the file
      r.open()

      // calls the closure passing the resource as the argument
      // ** closure = { res ->
      // **   res.read()
      // **   res.write()
      // ** }
      closure(r)

    }
    finally
    {
      // closes the resource
      r.close()
    }
  }

}

def resource = new Resource()
resource.open()
resource.read()
resource.write()

println "\n"

Resource.use { res ->
  res.read()
  res.write()
}

println "\n"
