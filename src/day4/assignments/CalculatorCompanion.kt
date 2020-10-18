package day4.assignments

class Calculator{
    
    companion object{
        fun add(num1: Int, num2: Int){
            var result = num1 + num2
            println(result)
        }
    }
}

fun Calculator.Companion.sub(num1 : Int, num2: Int){
    var result = num1 - num2
    println(result)
}

fun Calculator.Companion.mul(num1 : Int, num2: Int){
    var result = num1 * num2
    println(result)
}

fun Calculator.Companion.div(num1 : Int, num2: Int){
    var result = num1 / num2
    println(result)
}

class Test{

    fun invoke(){
        Calculator.add(5,5)
        Calculator.sub(10,5)
        Calculator.mul(5,5)
        Calculator.div(15,3)
    }
}
fun main(){

    val t = Test()
    t.invoke()
}