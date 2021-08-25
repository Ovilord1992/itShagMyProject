package m9.Task_2.entity.enums;

public enum MeasureType {

    piece("шт"), kg("кг"), tank("банок");

    private String name;

    MeasureType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
