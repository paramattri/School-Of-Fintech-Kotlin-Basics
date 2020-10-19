package day5.caseStudyTwitter.dao

import java.sql.*
import java.util.*

object MainDAO {

    internal var conn: Connection? = null
    internal var username = "root"
    internal var password = "Enter your own password"

    fun getConnection() {
        val connectionProps = Properties()
        connectionProps.put("user", MainDAO.username)
        connectionProps.put("password", MainDAO.password)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            MainDAO.conn = DriverManager.getConnection(
                    "jdbc:" + "mysql" + "://" +
                            "localhost" +
                            ":" + "3306" + "/" +
                            "",
                    connectionProps)
        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
        } catch (ex: Exception) {
            // handle any errors
            ex.printStackTrace()
        }
    }

    fun createDatabase(){

        var stmt : Statement? = null
        stmt = MainDAO.conn!!.createStatement()
        stmt!!.execute("CREATE DATABASE IF NOT EXISTS testdatabase;")
        stmt!!.execute("use testdatabase;")
    }

    fun connectionClose(){
        MainDAO.conn!!.close()
    }
    fun executeMySQLQuery() {
        var stmt: Statement? = null
        var resultset: ResultSet? = null
        try {
            stmt = MainDAO.conn!!.createStatement()
            if (stmt.execute("SHOW DATABASES;")) {
                resultset = stmt.resultSet
            }
            while (resultset!!.next()) {
                println(resultset.getString("Database"))
            }
        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
        } finally {
            // release resources
            if (resultset != null) {
                try {
                    resultset.close()
                }catch (sqlEx: SQLException) {
                }
                resultset = null
            }
            if (stmt != null) {
                try {
                    stmt.close()
                } catch (sqlEx: SQLException) {
                }
                stmt = null
            }
            if (MainDAO.conn != null) {
                try {
                    MainDAO.conn!!.close()
                } catch (sqlEx: SQLException) {
                }
                MainDAO.conn = null
            }
        }
    }

}