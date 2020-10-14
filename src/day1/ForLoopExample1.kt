package day1

fun main(args : Array<String>)
{
    val marks = arrayOf(80,45,67,23,67)

    for(item in marks){
        print(item.toString() + " ")
    }

    println()
    val fruits = arrayOf("Banana","Grapes","Mango")
    for(item in fruits){
        print("$item ")
    }

    println()
    for(item in marks.indices){
        print("marks[$item]: "+ marks[item]+" ")
    }
}