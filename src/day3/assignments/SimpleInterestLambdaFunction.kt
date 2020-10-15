package day3.assignments

fun main(){

    var p = 100
    var t = 2
    var r = 5.5f

    var sI : (Int, Int, Float) -> Float = { p : Int, t : Int, r : Float -> (p * t * r) / 100}
    println("Simple Interest is: ${sI(p , t , r)}")
}