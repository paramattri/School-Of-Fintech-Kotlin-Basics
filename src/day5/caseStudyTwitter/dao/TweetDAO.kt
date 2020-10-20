package day5.caseStudyTwitter.dao

import java.sql.PreparedStatement
import java.sql.Statement

object TweetDAO {

    fun createTweetTable(){
        var stmt: Statement? = null
        stmt = MainDAO.conn!!.createStatement()
        val sql = """
            CREATE TABLE IF NOT EXISTS tweets (
            username VARCHAR(255) NOT NULL,
            tweet VARCHAR(255) NOT NULL,
            created_time VARCHAR(255) NOT NULL)
        """.trimIndent()
        stmt!!.execute(sql)
    }

    fun insertTweet(tweet : String, userName : String, createdTime : String){
        var sql: String = "INSERT INTO tweets VALUES (?, ?, ?)";
        val statement: PreparedStatement? = MainDAO.conn?.prepareStatement(sql);
        if (statement != null) {
            statement.setString(1, userName)
        }
        if (statement != null) {
            statement.setString(2, tweet)
        }
        if (statement != null) {
            statement.setString(3, createdTime)
        }
        statement?.executeUpdate()
    }

    fun deleteTweet(tweet: String, userName: String){

        val sql : String = "DELETE FROM tweets WHERE tweet = '$tweet' AND username = '$userName'"
        var stmt = MainDAO.conn!!.createStatement()
        stmt!!.execute(sql)
    }

    fun displayTweet(userName: String){
        val sql : String = "SELECT * FROM tweets WHERE username = '$userName'"
        var stmt = MainDAO.conn!!.createStatement()
        val resultSet = stmt!!.executeQuery(sql)
        while (resultSet.next()){
            println("UserName: "+resultSet.getString("username")+"\tTweet: "+resultSet.getString("tweet")+"\tCreation Time: "+resultSet.getString("created_time"))
        }
    }

    fun updateTweet(tweetOld : String , tweetNew : String, userName: String){

        val sql : String = """
            UPDATE tweets 
            SET tweet = '$tweetNew'
            WHERE tweet = '$tweetOld' AND username = '$userName'
        """.trimIndent()

        var stmt = MainDAO.conn!!.createStatement()
        stmt!!.execute(sql)
    }

    fun trendingTweets(){

        val sql : String = """
            SELECT tweet, COUNT(tweet) AS count
            FROM tweets
            GROUP BY tweet
            ORDER BY count DESC
        """.trimIndent()
        var stmt = MainDAO.conn!!.createStatement()
        val resultSet = stmt!!.executeQuery(sql)
//        val resultSet1 = stmt!!.executeQuery("SELECT COUNT(*) AS rowcount FROM tweets")
//        resultSet1.next()
//        val noOfRows : Int = resultSet1.getInt("rowcount");
        while (resultSet.next()){
            println("Tweet: "+resultSet.getString("tweet")+"\t---> "+resultSet.getString("count"))
        }

    }
}
