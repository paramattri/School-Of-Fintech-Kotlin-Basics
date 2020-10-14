package day2

fun run(num : Int = 50, name : String = "Manipal", location : String = "Bangalore"){
    println("Parameter in fun definition is $num, $name and $location")
}

fun main(args : Array<String>){

    run()
    run(100)
    run(10000, name = "Jigsaw")
    run(5000, "Axis","Delhi")
}