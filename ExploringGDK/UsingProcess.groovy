process = "wc".execute()

process.out.withWriter {
  // Send input to process
  it << "Let the world know...\n"
  it << "Groovy Rocks!\n"
}

// Read output from the process
println process.in.text
// or
// println process.text
