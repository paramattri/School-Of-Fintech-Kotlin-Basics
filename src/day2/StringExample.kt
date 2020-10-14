package day2

fun main(args : Array<String>){

    val str1 = "Welcome!"
    val str2 = "Welcome!"

    if(str1.equals(str2))
        println("Two Strings are equal")

    println(str1.toLowerCase())
    println(str1.toUpperCase())

    println(str1.substring(0 , 3 ))
    println(str1.substring(0 , 3).toUpperCase())
    println(str1.length)

//    var text = """"""Please locate my Place
//                    #it is located in my native
//                    #please visit me
//                    """""".trimMargin("#")


}