package day3

class Vehicle{

    fun run():String{
        return "Vehicles are running"
    }
}

fun Vehicle.stop():String{
    return "Vehicles are stopped"
}

fun main(args : Array<String>){

    val v = Vehicle()
    println(v.run())
    println(v.stop())
}