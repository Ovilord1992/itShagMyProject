package Task_1;

import Task_1.service.AllPerson;
import Task_1.service.JsonConverter;
import Task_1.service.PersonModelSearch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonConverter jsonConverter = new JsonConverter();
//        AllPerson allPerson = new AllPerson();
        PersonModelSearch personModelSearch = new PersonModelSearch();

        jsonConverter.personInitializer("Vasiliy", "Lipinskiy", "Ovilord", List.of("+375259506602345", "+83745345345"), "Ovilor@Yandex.ru", "10.09.1992");
        System.out.println(personModelSearch.searchPerson("Vasiliy"));
//        System.out.println(allPerson.getAllName());
    }
}
