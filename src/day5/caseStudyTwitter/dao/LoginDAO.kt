package day5.caseStudyTwitter.dao
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Statement

object LoginDAO {

    fun createLoginTable(){
        var stmt: Statement? = null
        stmt = MainDAO.conn!!.createStatement()
        val sql = """
            CREATE TABLE IF NOT EXISTS login (
            username VARCHAR(255) PRIMARY KEY,
            password VARCHAR(255) NOT NULL)
        """.trimIndent()
        stmt!!.execute(sql)
    }

    fun insertLoginDetails(userName : String, password : String){

        val sql: String = "INSERT INTO login VALUES (?, ?)";
        val statement: PreparedStatement? = MainDAO.conn?.prepareStatement(sql);
        if (statement != null) {
            statement.setString(1, userName)
        }
        if (statement != null) {
            statement.setString(2, password)
        }

        statement?.executeUpdate()
    }

    fun validateLogin(userName: String, password: String) : Boolean{

        val sql: String = "SELECT password FROM login WHERE username = '$userName'"
        val statement : Statement? = MainDAO.conn!!.createStatement()
        var resultSet: ResultSet? = null
        var validated : Boolean = false
        if (statement != null) {
            resultSet = statement.executeQuery(sql)
        }

        if (resultSet != null) {
            if(!resultSet.isBeforeFirst)
                println("Check Your Username")
            else{
                resultSet.next()
                if(password == resultSet.getString("password")){
                    validated = true
                }
            }
        }

        if(validated){
            println("Welcome Back, You are now Logged In!")
        }else{
            println("Check Your Password")
        }
        return validated

    }
}