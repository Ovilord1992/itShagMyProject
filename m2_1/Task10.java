package m2_1;

public class Task10 {
    public static void main(String[] args) {
        final int height = 190;
        final int weight = 80;
        int wes = height - 110;

        if (wes > weight){
            System.out.println("Вам следует набрать " + (wes - weight) + " кг");
        }
        else if (wes < weight){
            System.out.println("Вам следует сбросить " + (weight - wes) + " кг");
        }
        else if (wes == weight){
            System.out.println("Вы великолепны");
        }
    }
}
