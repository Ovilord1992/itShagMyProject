package DZ.Task_5;

public class Kompleks {
    private double deystvit;
    private double mnimay;
    private String Z;

    public Kompleks(double deystvit, double mnimay) {
        this.deystvit = deystvit;
        this.mnimay = mnimay;
    }

    public void sloj(double deystvit, double mnimay) {
        Z = (this.deystvit + deystvit) + " + " + (this.mnimay + mnimay + "i");
    }

    public void vich(double deystvit, double mnimay) {
        Z = (this.deystvit - deystvit) + " + " + ((this.mnimay - mnimay) + "i");
    }

    public void umn(double deystvit, double mnimay) {
        double a = this.deystvit * deystvit;
        double b = this.deystvit * mnimay;
        double c = deystvit * this.mnimay;
        double d = mnimay * this.mnimay;
        Z = (a - d) + " + " + ((b) + (c) + "i");
    }

    public void del(double deystvit, double mnimay) {
        double a = this.deystvit * deystvit;
        double b = this.deystvit * mnimay;
        double c = deystvit * this.mnimay;
        double d = mnimay * this.mnimay;
        double aZnam = deystvit * deystvit;
        double bZnam = mnimay * mnimay;
        double prom = a + d;
        double prom2 = c - b;
        double promZnam = aZnam + bZnam;
        Z = (prom / promZnam) + " + " + prom2 / promZnam + "i";
    }

    public void print() {
        System.out.println(Z);
    }
}
