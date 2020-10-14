package day2

open class Emp4(name : String, age : Int, salary : Float){

    init {
        println("EmName is $name")
        println("EmAge is $age")
        println("EmSalary is $salary")
    }
}

open class Developer1(name: String, age: Int, salary: Float, project : String) : Emp3(name, age, salary)
{
    init {
        println("Project is $project")
    }
}

class SalesPerson1(name: String, age: Int, salary: Float, project: String, bonus : Float) : Developer1(name, age, salary, project)
{
    init {
        println("SalesPerson bonus is $bonus")
    }
}

fun main(args : Array<String>){

    val s = SalesPerson1("Param", 22, 60000f,"Website",5000f)
}