package DZ.Task_1;

import DZ.Task_1.Ex.MyExCoffee;
import DZ.Task_1.Ex.MyExTank;
import DZ.Task_1.Ex.MyExVoter;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMashin1 {
    int AMERICANO_COFFEE = 22;
    int AMERICANO_VOTER = 100;
    int ECSPRESSO_COFFEE = 22;
    int ECSPRESS_VOTER = 30;

    public int getECSPRESSO_COFFEE() {
        return ECSPRESSO_COFFEE;
    }

    public void setECSPRESSO_COFFEE(int ECSPRESSO_COFFEE) {
        this.ECSPRESSO_COFFEE = ECSPRESSO_COFFEE;
    }

    public int getECSPRESS_VOTER() {
        return ECSPRESS_VOTER;
    }

    public void setECSPRESS_VOTER(int ECSPRESS_VOTER) {
        this.ECSPRESS_VOTER = ECSPRESS_VOTER;
    }

    int tankVolume;
    int voter;

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    int coffee;

    public int getVoter() {
        return voter;
    }

    public void setVoter(int voter) {
        this.voter = voter;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    int tank = 0;
    public static List<Coffee> coffeeMashin1s = new ArrayList<>();
    public CoffeeMashin1(int tank, int voter, int coffee) {
        this.tankVolume = tank;
        this.voter = voter;
        this.coffee = coffee;
        coffeeMashin1s.add(new Americano(AMERICANO_COFFEE, AMERICANO_VOTER));
        coffeeMashin1s.add(new Ecspresso(ECSPRESSO_COFFEE,ECSPRESS_VOTER));
    }

    public void americano() throws Exception {
        try {
            mess(voter - AMERICANO_VOTER, coffee - AMERICANO_COFFEE, tank + AMERICANO_COFFEE);
            coffeeMashin1s.get(0).makeCoffee();
            voter -= AMERICANO_VOTER;
            coffee -= AMERICANO_COFFEE;
            tank += AMERICANO_COFFEE;

        }catch (MyExVoter e){
            System.err.println(e.getMessage());
        }catch (MyExCoffee g){
            System.err.println(g.getMessage());
        }catch (MyExTank z){
            System.err.println(z.getMessage());
        }
    }

    public void ecspresso() throws Exception{
        try {
            mess(voter - ECSPRESS_VOTER, coffee - ECSPRESSO_COFFEE, tank + ECSPRESSO_COFFEE);
            coffeeMashin1s.get(1).makeCoffee();
            voter -= ECSPRESS_VOTER;
            coffee -= ECSPRESSO_COFFEE;
            tank += ECSPRESSO_COFFEE;

        }catch (MyExVoter e){
            System.err.println(e.getMessage());
        }catch (MyExCoffee g){
            System.err.println(g.getMessage());
        }catch (MyExTank z){
            System.err.println(z.getMessage());
        }
    }

    public void mess(int volumeVoter, int volumeCoffee, int tank) throws Exception{
        if (volumeVoter < 0){
            throw new  MyExVoter();
        }
        if (volumeCoffee < 0){
            throw new MyExCoffee();
        }
        if (tank > tankVolume){
            throw new MyExTank();
        }
    }
}
