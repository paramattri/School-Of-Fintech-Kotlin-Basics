package day4.assignments

fun main(args : Array<String>){

    var list1 : MutableList<Int> = mutableListOf(1,2,3,4,5)
    var list2 : MutableList<Int> = mutableListOf(6,7,8,9,10)

    var joinedList : MutableList<Int> = mutableListOf()
    joinedList.addAll(list1)
    joinedList.addAll(list2)

    for (element in joinedList)
        print("$element ")
}