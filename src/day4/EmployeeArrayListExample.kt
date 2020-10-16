package day4

import java.util.*
import kotlin.collections.ArrayList

class Employee(var eId:Int, var eName:String, var eCity:String, var eSalary:Float)

fun main() {

    var read = Scanner(System.`in`)
    println("Enter the number of objects. ")
    var n = read.nextInt()
    var arrEmp: ArrayList<Employee> = ArrayList<Employee>(n)

    for (i in 0 until n) {
        println("Enter Id")
        var eId = read.nextInt()
        println("Enter Name")
        var eName = read.next()
        println("Enter City")
        var eCity = read.next()
        println("Enter Salary")
        var eSalary = read.nextFloat()
        var e = Employee(eId, eName, eCity, eSalary)
        arrEmp.add(e)
    }

    for (e in arrEmp) {
        println("Id: ${e.eId}  Name: ${e.eName}  City: ${e.eCity}  Salary: ${e.eSalary}")
    }
}