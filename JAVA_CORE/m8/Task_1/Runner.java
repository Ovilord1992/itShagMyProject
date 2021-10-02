package Task_1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Random random = new Random();
        System.out.println("Введите число для деления");
        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            int[] arr = new int[(random.nextInt(10) + 1)];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 21) - 10;
                ;
            }
            System.out.println(Arrays.toString(arr));
            for (int i : arr) {
                System.out.println(num / i);
            }
        } catch (ArithmeticException | InputMismatchException exByZero) {
            System.err.println(exByZero);
        }
    }
}
