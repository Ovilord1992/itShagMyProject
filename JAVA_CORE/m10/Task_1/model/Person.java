package Task_1.model;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class Person implements Jsonable {
    private String name;
    private String lastName;
    private String nickName;
    private List<String> telephone;
    private String email;
    private String yearOfBirth;


    public Person() {
    }

    public Person(String name, String lastName, String nickName, List<String> telephone, String email, String yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.nickName = nickName;
        this.telephone = telephone;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<String> getTelephone() {
        return telephone;
    }

    public void setTelephone(List<String> telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toJson() {
        final StringWriter writer = new StringWriter();
        try {
            this.toJson(writer);
        }catch (Exception e){
        }
        return writer.toString();
    }

    @Override
    public void toJson(Writer writer) throws IOException {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.put("name", this.getName());
        jsonObject.put("lastName", this.getLastName());
        jsonObject.put("nickName", this.getNickName());
        jsonObject.put("telephone", this.getTelephone());
        jsonObject.put("email", this.getEmail());
        jsonObject.put("yearOfBirth", this.getYearOfBirth());
        jsonObject.toJson(writer);
    }
}
