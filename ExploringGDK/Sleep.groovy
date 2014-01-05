//// Starts the thread
//thread = Thread.start {
  //println "Thread started"

  //// starts the stop watch
  //startTime = System.nanoTime()

  //// creates an object and sleeps for 2 seconds
  //new Object().sleep(2000)

  //// ends the stop watch
  //endTime = System.nanoTime()

  //// calculates total time elapsed
  //totalTime = (endTime - startTime) / 10**9

  //println "Thread done in ${totalTime} seconds"
//}

//println "----"

// takes 1 boolean parameter
def playWithSleep(flag)
{
  thread = Thread.start {
    println "Thread started"
    startTime = System.nanoTime()
    new Object().sleep(2000) {
      println "Interrupted..." + it
      // if the closure returns true
      // then the thread will be interrupted
      flag
    }

    endTime = System.nanoTime()
    println "Thread done in ${(endTime - startTime)/10**9}"
  }

  thread.interrupt()
  thread.join()
}

playWithSleep(true)

println "\n\n"
playWithSleep(false)
