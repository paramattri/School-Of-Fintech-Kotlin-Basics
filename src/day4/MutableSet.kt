package day4

fun main()
{
    var mySet1:MutableSet<String> = mutableSetOf<String>("a","b","c","c")
    var mySet2:MutableSet<Any> = mutableSetOf<Any>(2,6,4,5,6.5,6.4,"a","b","c",'q')
    var mySet3 : Set<Int> = hashSetOf<Int>(1,2,2,4,5)
    for(i in mySet1)
        println(i)
    for(i in mySet2)
        println(i)

    for(i in mySet3)
        println(i)
}