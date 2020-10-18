package day4.assignments

fun main(args : Array<String>){

    var list = ArrayList<Int>()
    list.add(10)
    list.add(20)
    list.add(30)
    list.add(40)
    list.add(50)

    var arr : Array<Int> = list.toTypedArray()
    for (i in arr)
        print("$i ")
}