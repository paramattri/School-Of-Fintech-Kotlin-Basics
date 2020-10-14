package day1

fun main(args : Array<String>){

    myForLoop@for(i in 1..5){
        for(j in 1..5){
            if(i == 2)
                break@myForLoop
            println("$i and $j")
        }
    }
}