package Task_1.service;

import Task_1.model.Person;

public class AllPerson {
    StringBuilder stringBuilder = new StringBuilder();
    JsonConverter jsonConverter = new JsonConverter();
    public String getAllName(){
        for (Person k : jsonConverter.jsonDescription()){
            stringBuilder.append(k.getName()).append(" ");
        }
        return toString();
    }

    @Override
    public String toString() {
        return "AllPerson : " + "\n" +
                "name : " + stringBuilder;
    }
}
