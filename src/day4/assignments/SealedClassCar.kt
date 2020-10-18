package day4.assignments

import java.util.*

sealed class Car{
    class Maruti : Car()
    class Hyudai : Car()
    class Honda : Car()
}

fun main(args : Array<String>){

    val read = Scanner(System.`in`)
    println("Enter the brand of the car: ")
    var brandName = read.next()

    when(brandName){
        "Maruti" -> println("Indian Make")
        "Hyundai" -> println("Korean Make")
        "Honda" -> println("Japan Make")
        else -> println("Valid Car Make")
    }
}