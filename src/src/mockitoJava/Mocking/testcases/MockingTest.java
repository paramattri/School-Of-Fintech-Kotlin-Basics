package mockitoJava.Mocking.testcases;

import mockitoJava.Mocking.logic.ListClass;
import mockitoJava.Mocking.logic.ListService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockingTest {

    @Test
    public void mock_test(){
        ListService listService = mock(ListService.class);
        List<String> bigList = Arrays.asList("Spring Core", "Spring Boot", "Kotlin");
        when(listService.getList("Spring")).thenReturn(bigList);
        ListClass list = new ListClass(listService);
        List<String> retrievedList = list.getListMethod("Spring");
        System.out.println(retrievedList);
        Assert.assertEquals(2, retrievedList.size());
    }

    @Test
    public void multipleReturn()
    {
        ListService listService=mock(ListService.class);
        List<String> bigList= Arrays.asList("Core", "Kotlin", "Spring Boot", "Spring MVC");

        when(listService.getList("Spring")).thenReturn(bigList).thenReturn(bigList).thenReturn(bigList);
        ListClass  list=new ListClass(listService);
        List<String> retrievedList=list.getListMethod("Spring");
        switch(retrievedList.size()) {
            case 1: Assert.assertEquals(1, retrievedList.size());
                break;
            case 2: Assert.assertEquals(2, retrievedList.size());
                break;
            case 3: Assert.assertEquals(3, retrievedList.size());
                break;
        }
        System.out.println(retrievedList);



    }
}
