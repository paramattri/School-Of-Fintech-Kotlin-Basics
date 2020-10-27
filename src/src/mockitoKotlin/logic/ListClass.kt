package mockitoKotlin.logic

import mockitoJava.Mocking.logic.ListService
import java.util.*


class ListClass(var listService: ListService) {
    fun getListMethod(match: String?): List<String> {
        val retrievedList1 = listService.getList(match)
        val retrievedList: MutableList<String> = ArrayList()
        for (list in retrievedList1) {
            if (list.contains("Spring")) {
                retrievedList.add(list)
            }
        }
        return retrievedList
    }
}
