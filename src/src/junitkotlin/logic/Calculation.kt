package junitkotlin.logic

class Calculation {

    companion object{

        fun findMax(arr : IntArray) : Int{

            var max = 0
            for(i in 0 until arr.size){
                if (max < arr[i])
                    max = arr[i]
            }

            return max
        }

        fun findCube(number : Long) : Long{

            return number * number * number
        }

    }
}