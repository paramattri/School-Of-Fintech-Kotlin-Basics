package mockitoJava.Stubbing.testcases;

import mockitoJava.Stubbing.logic.ListService;
import java.util.Arrays;
import java.util.List;

public class ListServiceStub implements ListService {

    @Override
    public List<String> getList(String str) {
        return Arrays.asList("Core Java", "Kotlin", "Spring Boot", "Spring MVC");
    }
}