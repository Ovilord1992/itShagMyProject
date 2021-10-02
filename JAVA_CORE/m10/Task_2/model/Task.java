package Task_2.model;

public class Task {
    private String title;
    private String description;
    private String priority;
    private String dateStart;
    private String dataEnd;
    private String worker;
    private boolean checkpoint;

    public Task() {
    }

    public Task(String title, String description, String priority, String dateStart, String dataEnd, String worker, boolean checkpoint) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.dateStart = dateStart;
        this.dataEnd = dataEnd;
        this.worker = worker;
        this.checkpoint = checkpoint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(String dataEnd) {
        this.dataEnd = dataEnd;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public boolean isCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(boolean checkpoint) {
        this.checkpoint = checkpoint;
    }
}
