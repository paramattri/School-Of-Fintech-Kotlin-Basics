package day2

open class Parent(){

    var a = 100 //public by default
    private var b = 200 //private to the parent class
    protected open var c = 300 //visible to parent & child
    internal  var d = 4 //visible to this module
}

class Child : Parent(){
    override var c = 350

    fun output(){
        println(a)
        println(c)
        println(d)
    }
}

fun main(args : Array<String>){

    var p = Parent()
    var c = Child()
    println("Parent a value: ${p.a}")
    println(p.d)
    println(c.a)
    println(c.d)
    c.output()
}