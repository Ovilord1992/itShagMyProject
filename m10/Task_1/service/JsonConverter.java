package Task_1.service;

import Task_1.model.Person;
import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.Jsoner;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class JsonConverter {

    private static final List<Person> list = new LinkedList<>();
    private static final Person person = new Person();
    private static final File file = new File("j.json");

    public void personInitializer(String name, String lastName, String nickName, List<String> telephone, String email, String year) {
        person.setName(name);
        person.setLastName(lastName);
        person.setNickName(nickName);
        person.setTelephone(telephone);
        person.setEmail(email);
        person.setYearOfBirth(year);
        jsonDescription();
        if (numChecker(telephone)) {
            addNewPerson();
        }
    }


    private void addNewPerson(){
        list.add(person);
        try(FileWriter fileWriter = new FileWriter(file)) {
            Jsoner.serialize(list, fileWriter);
        }catch (Exception ignored){}
    }

    public List<Person> jsonDescription(){
        try(FileReader fileReader = new FileReader(file)) {
            JsonArray objects = Jsoner.deserializeMany(fileReader);
            Mapper mapper = new DozerBeanMapper();

            JsonArray o = (JsonArray) objects.get(0);
            List<Person> collect = o.stream()
                    .map(x -> mapper.map(x, Person.class)).collect(Collectors.toList());
            list.clear();
            list.addAll(collect);
        } catch (JsonException | IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private boolean numChecker(List<String> tel){
        for (Person k : list){
            for (String j : k.getTelephone()){
                for (String s : tel){
                    if (j.equalsIgnoreCase(s)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
