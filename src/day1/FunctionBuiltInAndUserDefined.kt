package day1

fun main(args : Array<String>){

    var number = 25
    var result = Math.sqrt(number.toDouble())
    println("Square root is $result")

    var result1 = sum(5, 6)
    println("Sum is $result1")

}

fun sum(num1:Int, num2:Int) : Int{
    val add = num1 + num2
    return add
}