bldr = new groovy.swing.SwingBuilder()

frame = bldr.grame(
  title: 'Swing',
  size: [50, 100],
  layout: new java.awt.FlowLayout(),
  defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE
) {
  lbl = label(test: 'test')
  btn = button(text: 'Click me!', actionPerformed: {
    btn.text = 'Clicked!'
    label.text = 'Groovy!'
  })
}
