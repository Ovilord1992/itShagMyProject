package Task_3.textworcker;

import Task_3.model.CalcModel;

import java.io.*;
import java.util.Arrays;

public class TextParser {

    private static File file = new File("telephoneBook.txt");

    private static boolean fileChecker() {
        try {
            if (!file.isFile()) file.createNewFile();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return true;
    }

    public boolean record(CalcModel calcModel , int result) throws IOException {
        if (fileChecker()){
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(calcModel.getNum1() + " " + calcModel.getSum() + " " + calcModel.getNum2() + " = " + result + "\n");
            fileWriter.close();
        }
        return true;
    }

    public void getHistory() throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
