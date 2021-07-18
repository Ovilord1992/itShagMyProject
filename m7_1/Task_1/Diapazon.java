package DZ.Task_1;

public class Diapazon {
    private int diapazon;
    private int a;
    private int b;
    private static String calk = "";

    public static String getCalk() {
        return calk;
    }

    public void calks() {
        diapazon = this.b - this.a;
        calk += diapazon + ", ";
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Diapazon(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
