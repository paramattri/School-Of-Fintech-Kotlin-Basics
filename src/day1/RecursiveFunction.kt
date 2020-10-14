package day1

fun factorial(n : Int) : Long{
    return if(n == 1) {
        n.toLong()
    }
    else{
        n * factorial(n - 1)
    }
}

fun main(args : Array<String>){

    val number = 5
    val result : Long
    result = factorial(number)
    print("Factorial of $number = $result")
}