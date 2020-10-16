package day4

fun main()
{
    var list2:ArrayList<String> = arrayListOf<String>("Delhi","Mumbai","Bangalore","Chennai")
    var list1:ArrayList<String> = arrayListOf<String>("xxx","yyyy","zzzz")

    println(list2.get(2))
    list2.add("Hyd")
    printList(list2)
    list2.set(3,"Cal")
    printList(list2)
    list2.addAll(list1)
    printList(list2)
    list1.clear()
    printList(list1)
    list2.removeAt(3)
    printList(list2)
}