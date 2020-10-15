package day3.assignments

import java.util.*

tailrec fun factorial(number : Int, semiResult : Long) : Long{
    return if(number == 1) semiResult
            else
            factorial(number - 1,number * semiResult)
}

fun main(args : Array<String>){

    val read = Scanner(System.`in`)
    println("Enter the number: ")
    var number = read.nextInt()

    if(number < 50){
        var result = factorial(number,1)
        println(result)
    }
    else{
        println("Enter number less than 50")
    }


}