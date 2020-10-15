package day3.assignments

class Account(accId : Int, accType : String, accName : String){

    var accId = 0
    var accType = ""
    var accName = ""

    init {
        this.accId = accId
        this.accType = accType
        this.accName = accName
        println("Account Details: \nAccount Id: $accId\tAccount Type: $accType\tAccount Name: $accName")
    }
}

fun main(args : Array<String>){

    var a1 = Account(100,"Savings","Param")
    var a2 = Account(101,"Savings","Ravi")
    var a3 = Account(102,"Current","Piyush")
    var a4 = Account(103,"Savings","Milan")
    var a5 = Account(104,"Current","Prateek")


}