package day2

fun addNumber(num1: Int, num2: Int, myLambda: (Int) -> Unit){

    var addResult = num1 + num2
    myLambda(addResult)

}

fun main(args : Array<String>){

    val myLambda = {addResult : Int -> println("The addition result is $addResult")}
    addNumber(5, 6, myLambda)
}