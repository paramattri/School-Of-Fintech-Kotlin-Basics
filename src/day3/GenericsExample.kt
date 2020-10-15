package day3

class person<T>(age:T){
    var age:T
    init{
        this.age=age
        println(age)
    }
}
fun main(args:Array<String>)
{
    person(23)
    person("23") //conmpile error
}