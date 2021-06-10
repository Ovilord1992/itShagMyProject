package m2_1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        println("Введите количество детей: ");
        float child = scanner.nextFloat();

        println("количество пирожков для 100%: " + (int)Math.ceil(pie(child,100)) +
                "\nколичество пакетов молока для 100%: " + (int)Math.ceil(milcCalcPack(child, 100)));
        println("количество пирожков для 60%: " + (int)Math.ceil(pie(child,60)) +
                "\nколичество пакетов молока для 60%: " + (int)Math.ceil(milcCalcPack(child, 60)));
        println("количество пирожков для 1%: " + (int)Math.ceil(pie(child,1)) +
                "\nколичество пакетов молока для 1%: " + (int)Math.ceil(milcCalcPack(child, 1)));

    }

    public static void println(String s){
        System.out.println(s);
    }

    public static double milcCalcPack(double child, double mass){
        return  (float) (child / 100 * mass * 200 / 900);
    }

    public static double pie(double child, double mass){
        return  (float) (child / 100 * mass + child);
    }
}
