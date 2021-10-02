package DZ.Task_1;

import DZ.Task_2.Peresechenie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(", ");
        Peresechenie peresechenie = new Peresechenie();
        try {

            for (String k : str) {
                Diapazon d;
                String[] a = k.split(" ");
                ExChecker(d = new Diapazon(Integer.parseInt(a[0]), Integer.parseInt(a[1])));
                d.calks();
                peresechenie.parser(Integer.parseInt(a[0]), Integer.parseInt(a[1]));
            }
            System.out.println(Diapazon.getCalk().substring(0, Diapazon.getCalk().length() - 2));
            peresechenie.parser();
            System.out.println(peresechenie.getDdd());

        } catch (MyEx ex) {
            System.err.println(ex.getMessage());
        }
    }

    private static void ExChecker(Diapazon diapazon) throws MyEx {
        if (diapazon.getA() > diapazon.getB()) {
            throw new MyEx();
        }
    }
}
