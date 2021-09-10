package Task_1.model;

import java.util.List;

public class Telephone {
    private List<String> honeNum;
    private List<String> workNum;
    private List<String> mobNum;
    private List<String> faxNum;


//    public Telephone() {
//    }

    public Telephone(List<String> honeNum, List<String> workNum, List<String> mobNum, List<String> faxNum) {
        this.honeNum = honeNum;
        this.workNum = workNum;
        this.mobNum = mobNum;
        this.faxNum = faxNum;
    }

    public List<String> getHoneNum() {
        return honeNum;
    }

    public void setHoneNum(List<String> honeNum) {
        this.honeNum = honeNum;
    }

    public List<String> getWorkNum() {
        return workNum;
    }

    public void setWorkNum(List<String> workNum) {
        this.workNum = workNum;
    }

    public List<String> getMobNum() {
        return mobNum;
    }

    public void setMobNum(List<String> mobNum) {
        this.mobNum = mobNum;
    }

    public List<String> getFaxNum() {
        return faxNum;
    }

    public void setFaxNum(List<String> faxNum) {
        this.faxNum = faxNum;
    }
}
