def printThreadInfo(msg)
{
  // returns the current thread and store the output into a var
  def currentThread = Thread.currentThread()
  println "$msg Thread is ${currentThread}. Daemon? ${currentThread.isDaemon()}"
}

printThreadInfo('Main')

// starts the foreground thread
Thread.start {

  // prints the current thread info
  printThreadInfo "Started"

  sleep(3000) { println "Interrupted"  }

  println "Finished Started"
}

sleep(1000)

// startDaemon, runs the thread as a background process
Thread.startDaemon {
  printThreadInfo "Started Daemon"
  sleep(8000) { println "Interrupted"  }
  println "Finished Started daemon" // will not get here
}
