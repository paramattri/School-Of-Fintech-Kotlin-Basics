package day3.assignments

class Account1{

    var accId = 0
    var accType = ""
    var accName = ""

    constructor(accId : Int, accType : String, accName : String) {
        this.accId = accId
        this.accType = accType
        this.accName = accName
        println("Account Details: \nAccount Id: $accId\tAccount Type: $accType\tAccount Name: $accName")
    }
}

fun main(args : Array<String>){

    var a1 = Account1(100,"Savings","Param")
    var a2 = Account1(101,"Savings","Ravi")
    var a3 = Account1(102,"Current","Piyush")
    var a4 = Account1(103,"Savings","Milan")
    var a5 = Account1(104,"Current","Prateek")

}

