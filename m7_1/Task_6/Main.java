package DZ.Task_6;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Jornal[] jornals = new Jornal[2];
        jornals[0] = new Jornal(new Calendar("10, 07, 2021", "10"),  new Bilet(111, "ALex", 24), new Book("Бхаргава", "Грокаем алгоритмы"));
        jornals[1] = new Jornal(new Calendar("10, 07, 2021", "10"),  new Bilet(112, "Egor", 24), new Book("Дикинсон", "Моби Дик"));

        System.out.println("Название книги\tавтор\tномер читательского билета\tдата возврата\tпросрочка");
        for (Jornal j: jornals) {
            System.out.println(j.getBook().getAutor()
                    + " " +j.getBook().getNameBook()
                    + " " + j.getBilet().getId()
                    + " "  + j.getCalendar().dataVidoch()
                    + " " + j.getCalendar().prosrochka());
        }
    }
}
