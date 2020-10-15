package day3

fun main(){

    var location : Any = "Manipal"
    val unsafe : String? = location as String
    println("Unsafe done successfully value is $unsafe")

    val safeString : String? = location as? String
    println("Safe done successfully value is $safeString")

    val safeInt : Int? = location as? Int
    println("Safe done successfully value is $safeInt")
}