def sql = groovy.sql.Sql.newInstance(
  """jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};
  DBQ=C:/temp/weeather.xlsx';READONLY=false""", '', '')
)

println "City\t\tTemperature"
sql.eachRow('SELECT * FROM [temperatures$]') {
  println "${it.city}\t\t${it.temperature}"
}
