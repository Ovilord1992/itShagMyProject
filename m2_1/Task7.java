package m2_1;

public class Task7 {
    public static void main(String[] args) {
        double proc = 4.5;
        double summ = 1000;
        double year = 30;
        //с ежегодным пересчетом процентов или без
        boolean recalculation = true;

        if (recalculation){
            System.out.println(recalc(proc, summ, year));
        }else {
            double procent = summ / 100 * proc * year;
            System.out.println(procent + summ);
        }
    }

    public static double recalc(double pr, double summ, double year){
        double summYear = summ;
        for (double i = 0; i < year; i++){
            summYear = summYear / 100 * pr + summYear;
        }
        return (summYear);
    }
}
