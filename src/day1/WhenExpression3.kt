package day1

import java.util.*

fun main(args : Array<String>){

    val read = Scanner(System.`in`)
    println("Enter the Score in %")
    val score = read.nextInt()

    when(score){

        in 1..34 -> println("Fail")
        in 35..49 -> println("Third Class")
        in 50..59 -> println("Second Class")
        in 60..100 -> println("First Class")
        else -> println("Invalid Number")
    }
}