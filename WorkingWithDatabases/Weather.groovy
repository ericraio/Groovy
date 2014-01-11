def sql = groovy.sql.Sql.newInstance('jdbc:mysql//localost:3306/weatherinfo', userid, password, 'com.mysql.jdbc.Driver')

println sql.connection.catalog
