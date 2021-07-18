package DZ.Task_6;

public class Bilet {
    private int id;
    private String FIO;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public Bilet(int id, String FIO, int idGroup) {
        this.id = id;
        this.FIO = FIO;
        this.idGroup = idGroup;
    }

    private int idGroup;


}
