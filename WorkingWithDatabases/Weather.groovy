def sql = groovy.sql.Sql.newInstance('jdbc:mysql//localost:3306/weatherinfo', userid, password, 'com.mysql.jdbc.Driver')

println sql.connection.catalog

println "----"

Println "City               Temperature"
sql.eachRow('SELECT * from weather') {
  printf "%-20s%s\n", it.city, it[1]
}

println "----"

processMesa = { metaData ->
  metaData.columnCount.times { i ->
    printf "%-21s", metaData.getColumnLabel(i+1)
  }

  println "\n"
}

sql.eachRow('SELECT * from weather', processMeta) {
  printf "%-20s %s\n", it.city, it[1]
}

println "----"

rows = sql.rows('SELECT * from weather')
println "Weather info available from ${rows.size()} cites"

println "----"

dataSet = sql.dataSet('weather')
citiesBelowFreezing = dataSet.findAll { it.temperature < 32 }
println "Cities below freezing"
citiesBelowFreezing.each {
  println it.city
}

println "----"

printlnt "Number of cities : " + sql.rows("SELECT * from weather").size()
dataSet.add(city: 'Denver', temperature: 19)
println "Number of cities : " + sql.rows("SELECT * from weather").size()

println "----"

temperature = 50
sql.executeInsert("""INSERT INTO weather (city, temperature)
                      VALUES ('Oklahoma City', ${temperature})""")

println sql.firstRow("SELECT temperature from weather where city='Oklahoma City'")


