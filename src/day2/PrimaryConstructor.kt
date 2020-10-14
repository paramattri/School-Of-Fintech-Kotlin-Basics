package day2

class Employee(eId : Int, eName : String){

    var eName : String = ""
    var eId : Int = 0

    init{
        this.eId = eId
        this.eName = eName
    }

    fun output(){
        println("Emp id is $eId")
        println("Emp name is $eName")
    }
}

fun main(args : Array<String>){

    val e = Employee(100, "Param")
    e.output()
}