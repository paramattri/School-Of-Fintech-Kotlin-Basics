package day4

fun main()
{
    var arraylist1=ArrayList<String>()
    var arraylist2=ArrayList<String>(4)

    arraylist1.add("Bangalore")
    arraylist1.add("Delhi")
    arraylist1.add("Chennai")
    arraylist1.add("Chennai")
    arraylist1.add("Chennai")
    printList(arraylist1)

    arraylist2.add("Bangalore")
    arraylist2.add("Delhi")
    arraylist2.add("Chennai")
    arraylist2.add("Chennai")
    arraylist2.add("Chennai")
    arraylist2.add("Chennai")
    arraylist2.add("Chennai")
    arraylist2.add("Chennai")
    printList(arraylist2)

    var arraylist3 = ArrayList<String>(arraylist1)
    printList(arraylist3)
}

