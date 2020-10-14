package day2

class Student{

    var rollNo : Int = 0
    var name : String = ""
    var city : String = ""

    fun input(rollNo : Int, name : String, city : String){

        this.rollNo = rollNo
        this.name = name
        this.city = city
    }

    fun output(){

        println("RollNo is $rollNo")
        println("Name is $name")
        println("City is $city")
    }
}

fun main(args : Array<String>){

    val s = Student()
    s.input(25, "Param", "Delhi")
    s.output()
}