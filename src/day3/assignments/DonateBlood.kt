package day3.assignments

import java.util.*

fun checkDonate(age : Int, weight : Int){

    if(age > 18 && weight > 55)
        println("Eligible to Donate Blood")
    else
        println("Not Eligible to Donate Blood")
}


fun main(args : Array<String>){

    val read = Scanner(System.`in`)
    println("Enter Age: ")
    var age = read.nextInt()
    println("Enter Weight: ")
    var weight = read.nextInt()

    checkDonate(age, weight)
}