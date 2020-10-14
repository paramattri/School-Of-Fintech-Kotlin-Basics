package day2

fun main(args : Array<String>){

    var arr1 = arrayOf(12, 45, 67, 89, 45, 67)
    for(index in 0..arr1.size - 1){
        println(arr1[index])
    }

    // Iterating through Index
    for(index in 0..arr1.lastIndex){
        println(arr1[index])
    }

}