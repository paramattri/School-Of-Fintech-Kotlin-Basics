package day3.assignments

fun countVowels(str : String): Int
{
    var count = 0
    for(character in str.toCharArray()){
        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
            count++
        }
    }
    return count
}

fun main(args : Array<String>){

    var str = "Param Attri"
    println("Number of Vowels in $str is "+countVowels(str))
}