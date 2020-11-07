package mockitoKotlin.testcases

import mockitoJava.Mocking.logic.ListClass
import mockitoJava.Mocking.logic.ListService
import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito
import java.util.*


class MockingTest {
    @Test
    fun mock_test() {
        val listService = Mockito.mock(
            ListService::class.java
        )
        val bigList = Arrays.asList("Spring Core", "Spring Boot", "Kotlin")
        Mockito.`when`(listService.getList("Spring")).thenReturn(bigList)
        val list = ListClass(listService)
        val retrievedList = list.getListMethod("Spring")
        println(retrievedList)
        Assert.assertEquals(2, retrievedList.size.toLong())
    }

    @Test
    fun multipleReturn() {
        val listService = Mockito.mock(
            ListService::class.java
        )
        val bigList = Arrays.asList("Core", "Kotlin", "Spring Boot", "Spring MVC")
        Mockito.`when`(listService.getList("Spring")).thenReturn(bigList).thenReturn(bigList).thenReturn(bigList)
        val list = ListClass(listService)
        val retrievedList = list.getListMethod("Spring")
        when (retrievedList.size) {
            1 -> Assert.assertEquals(1, retrievedList.size.toLong())
            2 -> Assert.assertEquals(2, retrievedList.size.toLong())
            3 -> Assert.assertEquals(3, retrievedList.size.toLong())
        }
        println(retrievedList)
    }
}
