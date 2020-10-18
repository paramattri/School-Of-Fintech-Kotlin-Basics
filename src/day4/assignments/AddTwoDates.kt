package day4.assignments

import java.util.*

fun main(args : Array<String>){

    val c1 = Calendar.getInstance()
    val c2 = Calendar.getInstance()
    val cTotal = c1.clone() as Calendar

    cTotal.add(Calendar.YEAR, c2.get(Calendar.YEAR))
    cTotal.add(Calendar.MONTH, c2.get(Calendar.MONTH))
    cTotal.add(Calendar.DATE, c2.get(Calendar.DATE))
    cTotal.add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY))
    cTotal.add(Calendar.MINUTE, c2.get(Calendar.MINUTE))
    cTotal.add(Calendar.SECOND, c2.get(Calendar.SECOND))
    cTotal.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND))

    println("Date1: ${c1.time}  +  Date2: ${c2.time} ---->  Added Date: ${cTotal.time}")
}