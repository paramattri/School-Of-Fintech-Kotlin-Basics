package day2

fun addName(name : String, myLambda: (String) -> Unit){

    var name = name
    myLambda(name)

}

fun main(args : Array<String>){

    val myLambda = {name : String -> println("Welcome to $name's Program")}
    addName("Param", myLambda)
}