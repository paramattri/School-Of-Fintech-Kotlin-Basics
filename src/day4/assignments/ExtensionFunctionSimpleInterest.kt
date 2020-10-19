package day4.assignments

import java.util.*

fun <K,V> MutableMap<K,V>.simpleInterest(p : Int, r : Float, t : Int) : Float{

    return (p * r * t) / 100
}

fun main(){

    val read = Scanner(System.`in`)
    println("Enter the Principal Amount")
    var principal = read.nextInt()
    println("Enter the rate of Interest")
    var rate = read.nextFloat()
    println("Enter the Time Period")
    var time = read.nextInt()

    val list = mutableMapOf<String, Int>()
    val result = list.simpleInterest(principal, rate, time)
    println(result)

}


