package day2

//Multiple interfaces can be inherited by a single class
interface Shape{
    fun pick()
    {
        println("I am Shape..you pick shape from me")
    }
}
interface Paint{
    fun pick(){
        println("I am from paint..pick color from me")
    }
}
class Draw:Shape,Paint
{
    override fun pick() {
        super<Shape>.pick()
        super<Paint>.pick()
    }
}

fun main(args:Array<String>)
{
    var d=Draw()
    d.pick();
}