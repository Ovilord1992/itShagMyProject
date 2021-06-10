package m3_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] animal = {"Кошка", "Собака", "Корова", "Свинья", "Тигр", "Волк", "Ежик", "Воробей", "Лягушка", "Голубь"};
        String[] animalVoice = {"мяу", "гав", "му", "хрю", "р-р-р", "ау-у", "фыр", "курлык", "ква", "курлык"};
        for (int i = 0; i < animal.length; i++) {
            System.out.println("номер: " + (i + 1) + " животное: " + animal[i]);
        }
        System.out.println("введите животное: ");
        int animNum = scanner.nextInt();
        if (animNum > animal.length || animNum <= 0) {
            System.out.println("такого животного нет");
        } else System.out.println((animal[animNum - 1]) + " - " + animalVoice[animNum - 1]);


    }

}
