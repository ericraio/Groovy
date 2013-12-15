def foo1(int a, int... b)
{
  println "You passed $a and $b"
}

def foo2(int a, int[] b)
{
  println "You passed $a and $b"
}

foo1(1, 2, 3, 4, 5)
foo2(1, 2, 3, 4, 5)
