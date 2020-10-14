package day1

fun main(args : Array<String>){

    val num1 = 10
    val num2 = 40

    val result = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is less than $num2"
    println(result)

    // Kotlin Nested If

    val num3 = 30
    val result2 = if(num1 > num2){
        val max = if(num1 > num3){
            num1
        }
        else{
            num3
        }
        "from if block $max"
    }
    else if (num2 > num3){
        "from else if block $num2"
    }
    else{
        "from else block $num3"
    }

    println(result2)
}