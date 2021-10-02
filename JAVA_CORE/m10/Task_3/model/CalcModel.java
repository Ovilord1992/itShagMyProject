package Task_3.model;

public class CalcModel {
    private int num1;
    private int num2;
    private char sum;

    public CalcModel() {
    }

    public CalcModel(int num1, int num2, char sum) {
        this.num1 = num1;
        this.num2 = num2;
        this.sum = sum;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getSum() {
        return sum;
    }

    public void setSum(char sum) {
        this.sum = sum;
    }
}
