package Task_2;

import Task_2.model.Task;
import Task_3.model.CalcModel;

import java.io.*;

public class TextPars {

    private static File file = new File("task.txt");

    private static boolean fileChecker() {
        try {
            if (!file.isFile()) file.createNewFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public boolean record(Task task) throws IOException {
        if (fileChecker()) {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(
                    "title: " + task.getTitle() + "\n" +
                         "description: " + task.getDescription() + "\n" +
                           "dataStart: " + task.getDateStart() + "\n" +
                            "priority: " + task.getPriority() + "\n"+
                            "datastop: " + task.getDataEnd() + "\n"+
                            "worker: " + task.getWorker() + "\n"+
                            "checked: " +task.isCheckpoint() + "\n" +
                            "\n"
            );
            fileWriter.close();
        }
        return true;
    }

    //да, можно было сделать map, ретурнуть наверх, и сделать как правильно вывод в менеджере, но так проще:)
    public static void getFIle() throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
