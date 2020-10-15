package day3.assignments

fun findElement(arr : ArrayList<Any>, element: Any){

    var found = false
    for (e in arr){
        if(e == element){
            found = true
            println("Element Found $e")
            break
        }
    }
    if(!found){
        println("Element Not Found")
    }

}


fun main(args : Array<String>)
{
    var arr : ArrayList<Any> = arrayListOf("mango",10,"orange",20,30)
    var element = "apple"
    findElement(arr, element)
}