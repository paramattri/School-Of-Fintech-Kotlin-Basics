package day5.caseStudyTwitter

import day5.caseStudyTwitter.dao.LoginDAO.createLoginTable
import day5.caseStudyTwitter.dao.LoginDAO.insertLoginDetails
import day5.caseStudyTwitter.dao.LoginDAO.validateLogin
import day5.caseStudyTwitter.dao.MainDAO.connectionClose
import day5.caseStudyTwitter.dao.MainDAO.createDatabase
import day5.caseStudyTwitter.dao.MainDAO.getConnection
import day5.caseStudyTwitter.dao.TweetDAO.createTweetTable
import day5.caseStudyTwitter.dao.TweetDAO.deleteTweet
import day5.caseStudyTwitter.dao.TweetDAO.displayTweet
import day5.caseStudyTwitter.dao.TweetDAO.insertTweet
import day5.caseStudyTwitter.dao.TweetDAO.trendingTweets
import day5.caseStudyTwitter.dao.TweetDAO.updateTweet
import day5.caseStudyTwitter.dao.UserDAO.createUserTable
import day5.caseStudyTwitter.dao.UserDAO.insertUser
import day5.caseStudyTwitter.model.Tweet
import day5.caseStudyTwitter.model.User
import java.util.*
import java.util.regex.Pattern

fun main(args: Array<String>)
{
    val read = Scanner(System.`in`)
    var currentUserName : String = ""
    getConnection()
    createDatabase()
    println("\n")
    println("\t\t\t\t\t\t\t\t\tWelcome to BUZZ (Your Own Twitter)")
    while (true){
        println("\n\t\tPress 1 --> Registration \t\t\t  Press 2 --> Login \t\t\t Press 3 --> Exit")
        println("Enter your choice: ")
        val input1 = read.nextInt()
        var validate = true
        var emailValidate = false
        when(input1){
            1 -> {
                read.nextLine()
                println("Registration Details: ")
                println("Enter First Name: ")
                val firstName = read.nextLine()
                println("Enter Last Name: ")
                val lastName = read.nextLine()
                println("Enter UserName: ")
                val userName = read.nextLine()
                println("Enter Password: ")
//                val con = System.console()
//                val ch = con.readPassword()
//                val password = String(ch)
                val password = read.nextLine()
                println("Enter Email ID: ")
                val emailId = read.nextLine()

                val emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"
                val pat: Pattern = Pattern.compile(emailRegex)
                emailValidate = pat.matcher(emailId).matches()

                if (emailValidate) {
                    val userOb = User(firstName, lastName, userName, password, emailId)
                    createUserTable()
                    insertUser(userOb.firstName, userOb.lastName, userOb.userName, userOb.password, userOb.emailId)
                    createLoginTable()
                    insertLoginDetails(userOb.userName, userOb.password)
                } else {
                    println("Please enter a correct email address, And Register again!")
                }

            }

            2 -> {
                read.nextLine()
                println("Enter UserName: ")
                currentUserName = read.nextLine()
                println("Enter Password: ")
                val password: String = read.nextLine()
                validate = validateLogin(currentUserName, password)
            }

            3 -> System.exit(0)
            else -> {
                println("Enter a Valid Option!")
                validate = false
            }
        }
        if (input1 == 1)
            continue

        if(validate){
            break
        }
    }

    var tweetOb : Tweet
    while (true){
        println("Choose from the Below Options: ")
        println("1. Insert Tweet\t 2. Delete Tweet\t 3. Display Tweet/Tweets\t 4. Display Tweet By Username\t 5. Update Tweet\t 6. Trending Tweets\t 7. Logout")
        val input2 = read.nextInt()
        read.nextLine()
        when(input2){

            1 -> {
                println("Enter the Tweet: ")
                val tweet = read.nextLine()
                tweetOb = Tweet(tweet, currentUserName)
                createTweetTable()
                insertTweet(tweetOb.tweet, tweetOb.userName, tweetOb.createdTime)
            }

            2 -> {
                println("Enter the Tweet to be Deleted: ")
                val delTweet = read.nextLine()
                deleteTweet(delTweet, currentUserName)
            }

            3 -> {
                displayTweet(currentUserName)
            }

            4 -> {
                println("Enter the UserName for which you wish to see the Tweets: ")
                val userName = read.nextLine()
                displayTweet(userName)
            }

            5 -> {
                println("Enter the tweet which you want to update: ")
                val tweetOld = read.nextLine()
                println("Enter the New Tweet")
                val tweetNew = read.nextLine()
                updateTweet(tweetOld, tweetNew, currentUserName)
                println("Tweet Updated!")
            }

            6 -> trendingTweets()

            7 -> {
                println("Thanks for Your Time")
                println("Exiting....")
                System.exit(0)
            }

            else -> println("Enter a Valid Option!")
        }
    }

    connectionClose()

}