package day4.assignments

fun <T> displayList(list : List<T> ){

    for (element in list){
        print("$element ")
    }
    println()
}

fun main(){

    var intList : List<Int> = listOf<Int>(1,5,10,15,20)
    var strList : List<String> = listOf("Param", "Saibi","Mini","Milan")
    var mixedList : List<Any> = listOf("Param", 10, 55, 88.2, "Piyush")

    displayList(intList)
    displayList(strList)
    displayList(mixedList)
}