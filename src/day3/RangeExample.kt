package day3

fun main()
{
    for(r in 1..10)
    {
        print("$r ")

    }
    println()
    var r1=5.0..10.0
    println(r1)
    println("5.5 in range is ${5.5 in r1}")

    for(c in 'a'..'z')
    {
        print(c+" ")
    }
    //downTo, downTo() and rangeTo()
    println()
    for(x in 10 downTo 1 step 2)
        print("$x ")
    println()

    for(x in 10.downTo(1) )
    {
        print("$x ")
    }
    println()
    for(x in 1.rangeTo(20) step 2 )
    {
        print("$x ")
    }
    println()
    val tmp =(1..50)
    val it=tmp.iterator()
    while(it.hasNext())
    {
        print("${it.next()} ")
    }
}