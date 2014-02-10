try
{
  divide(2, 0)
  fail "Expected ArithmeticException"
}
catch(ArithmeticException ex)
{
  assertTrue true // Success
}


shouldFail { divide(2, 0) }

shouldFail(ArithmeticException) { divide(2, 0) }

shouldFail ArithmeticException, { divide(2, 0) }
