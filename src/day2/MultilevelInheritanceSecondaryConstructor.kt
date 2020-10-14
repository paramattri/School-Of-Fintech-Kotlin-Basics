package day2

open class Emp5{

    constructor(name : String, age : Int, salary : Float) {
        println("EmName is $name")
        println("EmAge is $age")
        println("EmSalary is $salary")
    }
}

open class Developer2: Emp5
{
    constructor(name: String, age: Int, salary: Float, project : String) : super(name, age, salary){
        println("Project is $project")
    }
}

class SalesPerson : Developer1
{
    constructor(name: String, age: Int, salary: Float, project: String, bonus : Float) : super(name, age, salary, project){
        println("SalesPerson bonus is $bonus")
    }
}

fun main(args : Array<String>){

    val s = SalesPerson("Param", 22, 60000f,"Website",5000f)
}