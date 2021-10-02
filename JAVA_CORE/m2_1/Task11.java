package itShagMyProject.m2_1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();

        int day = sec / 86400;
        int dayOst = sec % 86400;
        int hour = dayOst / 3600;
        int hourOst = dayOst % 3600;
        int min = hourOst/ 60;
        int minOs = hourOst % 60;

        System.out.println(
                day + " дней " + hour + " часов " + min + " минут " + minOs + " секунды" );
    }
}
