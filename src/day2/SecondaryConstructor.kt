package day2

class Emp{

    var eName : String = ""
    var eId : Int = 0

    constructor(eName : String, eId : Int){
        this.eName = eName
        this.eId = eId
        println("Emp id is $eId")
        println("Emp name is $eName")
    }

}

fun main(args : Array<String>){
    var e = Emp("Param", 100)
}