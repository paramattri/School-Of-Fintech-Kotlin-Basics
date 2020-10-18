package day4.assignments

fun main(args : Array<String>){

    var map : HashMap<String, String> = HashMap<String, String>()
    map.put("Param","Delhi")
    map.put("Prateek","Mumbai")
    map.put("Piyush","Jaipur")
    map.put("Prabhanshu","Noida")

    val keyList = ArrayList(map.keys)
    val valList = ArrayList(map.values)

    println(keyList)
    println(valList)
}