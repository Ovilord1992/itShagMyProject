package ItShag.itShagMyProject.m5_1;

public class test {
    public static void main(String[] args) {
        int b = Integer.MAX_VALUE;

        int z = 0;

        long start = System.currentTimeMillis();
        for (int i = 0; i < b; i++){
            if (i % 2 == 0) z++;
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);

        System.out.println(z);
    }
}
