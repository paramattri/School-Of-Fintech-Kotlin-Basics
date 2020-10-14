package day2

class Emp1(eCity: String){

    var eName : String = ""
    var eId : Int = 0
    var eCity : String = ""

    constructor(eName : String, eId : Int, eCity : String) : this(eCity){
        this.eName = eName
        this.eId = eId
        this.eCity = eCity
        println("Emp id is $eId")
        println("Emp name is $eName")
        println("Emp city is $eCity")
    }

}

fun main(args : Array<String>){
    var e = Emp1("Param", 100,"Delhi")
}