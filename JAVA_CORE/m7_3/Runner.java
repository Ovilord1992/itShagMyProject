package DZ;

import DZ.Task_1.CoffeeMashin1;
import DZ.Task_2.CoffeeMashin2;
import DZ.Task_3.CoffeMashin3;

import java.util.Scanner;

public class Runner {
    public static CoffeeMashin1 coffeeMashin1 = new CoffeeMashin1(350, 471, 500);
    public static CoffeeMashin2 coffeeMashin2 = new CoffeeMashin2(350, 471, 500, 500);
    public static CoffeMashin3 coffeMashin3 = new CoffeMashin3(350, 471, 500, 500);

    public static void main(String[] args) throws Exception {
        starter1();
    }

    public static void starter1() throws Exception {
        System.out.println("1 - включить  2 - выулючть  3 - американо  4 - экспрессо  5 - очистить бак");
        start1();
    }
    public static void start1() throws Exception {
        System.out.println("Voter: " + coffeeMashin1.getVoter() + " Coffee: " + coffeeMashin1.getCoffee() + " TankVolume: " + coffeeMashin1.getTank());
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1 -> coffeeMashin1.start();
            case 2 -> coffeeMashin1.stop();
            case 3 -> coffeeMashin1.americano();
            case 4 -> coffeeMashin1.ecspresso();
            case 5 -> coffeeMashin1.setTank(0);
        }
        start1();
    }

    public static void starter2() throws Exception {
        System.out.println("1 - включить  2 - выулючть  3 - американо  4 - экспрессо  5 - латте  6 - капучино  7 - очистить бак");
        start2();
    }
    public static void start2() throws Exception {
        System.out.println("Voter: " + coffeeMashin2.getVoter() + " Coffee: " + coffeeMashin2.getCoffee() + " TankVolume: " + coffeeMashin2.getTank() +  " MilkTank: " + coffeeMashin2.getMilkTank());
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1 : {
                coffeeMashin2.start();
                break;
            }
            case 2 : {
                coffeeMashin2.stop();
                break;
            }
            case 3 : {
                coffeeMashin2.americano();
                break;
            }
            case 4 : {
                coffeeMashin2.ecspresso();
                break;
            }
            case 5 : {
                System.out.println("введите количество молока");
                coffeeMashin2.latte(scanner.nextInt());
                break;
            }
            case 6 : {
                System.out.println("введите количество молока");
                coffeeMashin2.capuchno(scanner.nextInt());
                break;
            }
            case 7 : {
                coffeeMashin2.setTank(0);
                break;
            }
        }
        start2();
    }

    public static void starter3() throws Exception {
        System.out.println("1 - включить  2 - выулючть  3 - американо  4 - latte  5 - очистить бак");
        start3();
    }
    public static void start3() throws Exception {
        System.out.println("Voter: " + coffeMashin3.getVoter() + " Coffee: " + coffeMashin3.getCoffee() + " TankVolume: " + coffeMashin3.getTank() +  " MilkTank: " + coffeMashin3.getMilkTank());
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1 : {
                coffeMashin3.start();
                break;
            }
            case 2 : {
                coffeMashin3.stop();
                break;
            }
            case 3 : {
                coffeMashin3.americano();
                break;
            }
            case 4 : {
                System.out.println("введите количество молока");
                coffeMashin3.latte(scanner.nextInt());
                break;
            }
            case 5 : {
                coffeMashin3.setTank(0);
                break;
            }
        }
        start3();
    }
}
