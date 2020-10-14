package day2

open class Emp3(name : String, age : Int, salary : Float){

    init {
        println("EmName is $name")
        println("EmAge is $age")
        println("EmSalary is $salary")
    }
}

class Developer(name: String, age: Int, salary: Float, project : String) : Emp3(name, age, salary)
{
    init {
        println("Project is $project")
    }
}

fun main(args : Array<String>){

    val d = Developer("Param", 22, 60000f,"Website")
}