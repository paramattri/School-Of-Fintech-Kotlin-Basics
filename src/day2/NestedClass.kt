package day2

class OuterClass{

    var name : String = "John"
    class InnerClass{
        private var str : String = "Param"
        fun foo(){
            println(str)
        }
    }
}

fun main(args : Array<String>){

    OuterClass.InnerClass().foo()
    var o = OuterClass()
    println(o.name)
}