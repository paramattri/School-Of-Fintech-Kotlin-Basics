package day2

class Emp2{

    constructor(eId : Int, eName : String) : this(eId, eName, "Bangalore"){
        println("Eid is ${eId}")
        println("Ename is ${eName}")
    }

    constructor(eId: Int, eName: String, eCity : String){
        println("Eid is ${eId}")
        println("Ename is ${eName}")
        println("Ecity is ${eCity}")
    }
}

fun main(args : Array<String>){

    var e = Emp2(100,"Param")
}