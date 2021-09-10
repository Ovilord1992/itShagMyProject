package Task_1;

import Task_1.service.JsonConverter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonConverter jsonConverter = new JsonConverter();
        jsonConverter.personInitializer("Vasia", "jajs", "sdlfd", List.of("+34534", "+4534534"), "Ovilor@Usdf", "10.09.1992");
        jsonConverter.getListPerson();
    }
}
