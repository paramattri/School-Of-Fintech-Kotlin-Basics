package day5.caseStudyTwitter.model

class User {

    var firstName: String = ""
    var lastName : String = ""
    var userName : String = ""
    var password : String = ""
    var emailId : String = ""

    constructor(firstname: String, lastname : String, userName : String, password : String, emailId : String){

        this.firstName = firstName
        this.lastName = lastName
        this.userName = userName
        this.password = password
        this.emailId = emailId

    }

}