package day2

open class Animal{

    open var color = ""
    open fun eat(){
        println("I am animal.. i like to eat always")
    }
}

class Dog : Animal()
{
    override var color = "Brown"
    override fun eat(){
        super.eat()
        println("I am a dog, my color is $color and i like to eat bones")
    }

    fun bark(){
        println("I am a Dog, i bark heavily")
    }
}

class Cat : Animal(){
    override var color = "White"
    override fun eat(){
        println("I am a cat, my color is $color and i like to eat Rats")
    }

    fun afraid(){
        println("I am a cat. I am scared of dogs.")
    }
}

fun main(args : Array<String>){

    var d = Dog()
    d.eat()
    d.bark()
    var c = Cat()
    c.eat()
    c.afraid()
}