package Task_2;

import Task_2.service.TaskManager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TaskManager taskManager = new TaskManager();
        TextPars.getFIle();
        taskManager.add("задача", "описание какой то задачи", "высокий", "вчера", "сегодня", "я", true);
    }

}
