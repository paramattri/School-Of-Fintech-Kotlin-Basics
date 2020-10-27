package junitkotlin.testcases

import junitkotlin.logic.Calculation
import org.junit.*

class CalculationTest {

    companion object{
        @JvmStatic
        @BeforeClass
        fun setUpBeforeClass(){
            println("Before Class method invoked only once.")
        }

        @JvmStatic
        @AfterClass
        fun setUpAfterClass(){
            println("After class method invoked after all test cases.")
        }
    }

    @Before
    fun setUpBefore(){
        println("Before Method")
    }

    @Test
    fun testFindMax(){
        val arr = intArrayOf(1,2,3,4,5,6,7)
        println("FindMax")
        Assert.assertEquals(7, Calculation.findMax(arr))
    }

    @Test
    fun findCube(){
        println("FindCube")
        Assert.assertEquals(27, Calculation.findCube(3))
    }

    @After
    fun setUpAfter(){
        println("After Method")
    }

}