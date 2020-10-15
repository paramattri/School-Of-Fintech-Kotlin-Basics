package day3

fun main(args : Array<String>){

    var str : String? = "Welcome to my session!"
    var len = if(str != null)str.length else 0
    println("The String is $str and length is $len")

    str = null
    len = if(str != null)str.length else 0
    println("The String is $str and length is $len")
}