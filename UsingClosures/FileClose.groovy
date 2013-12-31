writer = new FileWriter('output.txt')
writer.write('!')
// forgot to call writer.close()

new FileWriter('output.txt').withWriter { writer  ->
  writer.write('a')
}
