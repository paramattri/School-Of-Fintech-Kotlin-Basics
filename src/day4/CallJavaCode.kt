package day4

fun main(){

    var result = JavaToKotlin.`fun`("Param","Delhi")
    println(result)

    var myJavaObj = JavaToKotlin()
    myJavaObj.firstName = "Param"
    myJavaObj.lastName = "Attri"

    println(myJavaObj.firstName +" "+ myJavaObj.lastName)
}