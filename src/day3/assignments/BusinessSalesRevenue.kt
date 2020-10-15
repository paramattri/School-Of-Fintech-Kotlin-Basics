package day3.assignments

import java.util.*

fun main(args : Array<String>){

    val read = Scanner(System.`in`)
    println("Enter Business Sales Revenue: ")
    var revenue = read.nextInt()

    var bonus = when(revenue){

        in 10000..20000 -> 1500
        in 21000..40000 -> 2500
        in 41000..60000 -> 3500
        else -> "Not eligible now"
    }

    println("Bonus: $bonus")
}