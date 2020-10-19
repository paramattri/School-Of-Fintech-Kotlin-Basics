package day5.caseStudyTwitter.dao
import java.sql.PreparedStatement
import java.sql.Statement

object UserDAO {

    fun createUserTable() {
        var stmt: Statement? = null
        stmt = MainDAO.conn!!.createStatement()
        val sql = """
            CREATE TABLE IF NOT EXISTS user (
            firstname VARCHAR(255) NOT NULL,
            lastname VARCHAR(255),
            username VARCHAR(255) PRIMARY KEY,
            email_id VARCHAR(255) NOT NULL,
            password VARCHAR(255) NOT NULL)
        """.trimIndent()
        stmt!!.execute(sql)
    }

    fun insertUser(firstName: String, lastName: String, userName: String, password: String, emailId: String) {
        var sql: String = "INSERT INTO user VALUES (?, ?, ?, ?, ?)";
        var statement: PreparedStatement? = MainDAO.conn?.prepareStatement(sql);
        if (statement != null) {
            statement.setString(1, firstName)
        }
        if (statement != null) {
            statement.setString(2, lastName)
        }
        if (statement != null) {
            statement.setString(3, userName)
        }
        if (statement != null) {
            statement.setString(4, emailId)
        }
        if (statement != null) {
            statement.setString(5, password)
        }

        statement?.executeUpdate()

    }


}
