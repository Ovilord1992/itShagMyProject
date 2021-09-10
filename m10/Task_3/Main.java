package Task_3;

import Task_3.services.DataModelMenager;
import Task_3.textworcker.TextParser;

import java.io.IOException;

public class Main {
    public static  void main(String[] args) throws IOException {
        DataModelMenager dataModelMenager = new DataModelMenager();
        System.out.println(dataModelMenager.add(1,5, '+'));

        TextParser textParser = new TextParser();
        textParser.getHistory();
    }
}
