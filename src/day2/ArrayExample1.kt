package day2

fun main(args : Array<String>){

    var arr5 = arrayOf(45, 67, "Mango", "Apple")
    arr5.set(2, "Orange")
    for(items in arr5){
        println(items)
    }
    println(arr5.get(1))
}