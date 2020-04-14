@Grapes([
        @Grab(group = 'org.xerial', module = 'sqlite-jdbc', version = '3.7.2'),
        @GrabConfig(systemClassLoader = true)
])
import groovy.sql.Sql

//Соединение с DB
def db = [url: 'jdbc:mysql://localhost:3306/Lab5?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC', user: 'root', password: '8951fdsa', driver: 'org.sqlite.JDBC']

def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)

ArrayList<Integer> id = new ArrayList<>()
sql.eachRow("select * from Item") {
    id.add(it.id)
    println("id=${it.id}, name= ${it.Title}")
}

println(id.size())
