package m9.Task_1;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.register(new Gamer("Vasia"), Arrays.asList(new Game("mario"), new Game("fallout"))));
        System.out.println(service.register(new Gamer("Ovilord"), Arrays.asList(new Game("mario"), new Game("fallout"))));
        System.out.println(service.register(new Gamer("Ovilord"), Arrays.asList(new Game("mario"), new Game("fallout"))));
        System.out.println(service.register(new Gamer("Maria"), Arrays.asList(new Game("borderlends"), new Game("космические рейнджеры"))));
        System.out.println(service.register(new Gamer("Asya"), Arrays.asList(new Game("borderlends"), new Game("fallout"), new Game("mario"))));

        //создать item для приема данны в строковом виде, вместо объектов
        service.plaing(new Gamer("Vasia"), new Game("mario"));
        service.plaing(new Gamer("Vasia"), new Game("mario"));
        service.plaing(new Gamer("Vasia"), new Game("fallout"));
        service.plaing(new Gamer("Maria"), new Game("космические рейнджеры"));
        service.plaing(new Gamer("Maria"), new Game("космические рейнджеры"));
        service.plaing(new Gamer("Ovilord"), new Game("mario"));
        service.plaing(new Gamer("Ovilord"), new Game("fallout"));
        service.plaing(new Gamer("Asya"), new Game("mario"));


        System.out.println(service.getRatePerName(new Gamer("Vasia"), new Game("mario")));
        System.out.println(service.getGamesList());
        System.out.println(service.topList(new Game("mario")));
        System.out.println(service.topListAllGames());



    }
}
