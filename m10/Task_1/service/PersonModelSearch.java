package Task_1.service;

import Task_1.model.Person;


public class PersonModelSearch {
    Person person;
    JsonConverter jsonConverter = new JsonConverter();
    public String searchPerson(String searchParam){
        for (Person k : jsonConverter.jsonDescription()){
            if (k.getName().equalsIgnoreCase(searchParam)){
                person = k;
                return toString();
            }
            for (String j : k.getTelephone()){
                if (j.equalsIgnoreCase(searchParam)){
                    person = k;
                    return toString();
                }
            }
        }
        return "контак не найдет";
    }

    @Override
    public String toString() {
        return " Person Nick: " + person.getNickName() + "\n" +
        " Person Name: " + person.getName() + "\n" +
        " Person LastName: " + person.getLastName() + "\n" +
        " Person Email: " + person.getEmail() + "\n" +
        " Person Year: " + person.getYearOfBirth() + "\n" +
        " Person Telephone: " + person.getTelephone();
    }
}
