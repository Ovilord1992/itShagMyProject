package DZ.Task_3;

public class Money {
    private long grivna;
    private byte kop;

    public Money(long grivna, byte kop) {
        this.grivna = grivna;
        this.kop = kop;
    }

    public void balansPrint() {
        if (this.grivna < 0){
            System.err.println("Скоро банк отнимет квартиру за долги");
        }
        System.out.println(grivna + ", " + kop);
    }

    public void sloj(long grivna, byte kop) {
        this.grivna += grivna;
        if (this.kop + kop > 100) {
            this.grivna += (this.kop + kop) / 100;
            this.kop = (byte) ((this.kop + kop) % 100);
        }
    }

    public void vich(long grivna, byte kop) {
        this.grivna -= grivna;
        if (this.kop - kop < 0) {
            this.grivna--;
            this.kop = (byte) ((this.kop + 100) - kop);
        }
    }

    public void delenie(double delitel) {
        long a = (this.grivna * 100 + this.kop);
        this.grivna = (long) (a / delitel / 100);
        this.kop = (byte) ((a / delitel) % 100);
    }

    public void mnojitel(double mnoj) {
        this.grivna *= mnoj;
        if (this.kop * mnoj > 100){
            this.grivna += (long) this.kop * mnoj / 100;
            this.kop = (byte) (this.kop * mnoj % 100);
        }
    }

    public String sravnenie(long grivna, byte kop){
        if (this.grivna * 100 + this.kop > grivna * 100 + kop){
            return "сумма на счету больше";
        }
        return "сумма на счету меньше";
    }

}
