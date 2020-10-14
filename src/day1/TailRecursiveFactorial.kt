package day1

tailrec fun fact(num : Long, semiResult : Long) : Long{

    return if(num == 1L)
                semiResult
            else
                fact(num - 1, num * semiResult)
}

fun main(args : Array<String>){

    val n = 1
    var result = fact(20, n.toLong())
    println("Factorial is $result")

}