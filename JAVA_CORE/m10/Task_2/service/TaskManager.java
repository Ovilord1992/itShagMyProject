package Task_2.service;

import Task_2.TextPars;
import Task_2.model.Task;

import java.io.File;
import java.io.IOException;

public class TaskManager {

    Task task = new Task();
    TextPars textPars = new TextPars();

    public boolean add(String title,
            String description,
            String priority,
            String dateStart,
            String dataEnd,
            String worker,
            boolean checkpoint) throws IOException {
        task.setTitle(title);
        task.setDescription(description);
        task.setPriority(priority);
        task.setDateStart(dateStart);
        task.setDataEnd(dataEnd);
        task.setWorker(worker);
        task.setCheckpoint(checkpoint);

        textPars.record(task);
        return true;
    }

}
