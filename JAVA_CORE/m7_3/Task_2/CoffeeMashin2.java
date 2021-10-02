package DZ.Task_2;

import DZ.Task_1.Coffee;
import DZ.Task_1.CoffeeMashin1;
import DZ.Task_1.Ex.*;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMashin2 extends CoffeeMashin1 {
    int milk;
    int milkTank;

    public int getMilkTank() {
        return milkTank;
    }

    public static List<Coffee> coffeeMashin2s = new ArrayList<>();

    public CoffeeMashin2(int tank, int voter, int coffee, int milkTank) {
        super(tank, voter, coffee);
        this.milkTank = milkTank;
        coffeeMashin2s.add(new Latte(22, 30, 0));
        coffeeMashin2s.add(new Capuchino(22, 30, 0));

    }

    public void latte(int milk) throws Exception {
        try {
            mess(getVoter() - getECSPRESS_VOTER(),
                    getCoffee() - getECSPRESSO_COFFEE(),
                    getTank() + getECSPRESSO_COFFEE(),
                    milkTank - milk);
            coffeeMashin2s.get(0).makeCoffee();
            setVoter(getVoter() - getECSPRESS_VOTER());
            setCoffee(getCoffee() - getECSPRESSO_COFFEE());
            setTank(getTank() + getECSPRESSO_COFFEE());
            this.milkTank -= milk;

        } catch (MyExVoter | MyExCoffee | MyExTank | MyExMilk e) {
            System.err.println(e.getMessage());
        }
    }

    public void capuchno(int milk) throws Exception {
        try {
            mess(getVoter() - getECSPRESS_VOTER(),
                    getCoffee() - getECSPRESSO_COFFEE(),
                    getTank() + getECSPRESSO_COFFEE(),
                    milkTank - milk);
            coffeeMashin2s.get(1).makeCoffee();
            setVoter(getVoter() - getECSPRESS_VOTER());
            setCoffee(getCoffee() - getECSPRESSO_COFFEE());
            setTank(getTank() + getECSPRESSO_COFFEE());
            this.milkTank -= milk;

        } catch (MyExVoter | MyExCoffee | MyExTank | MyExMilk e) {
            System.err.println(e.getMessage());
        }
    }


    public void mess(int volumeVoter, int volumeCoffee, int tank, int milkTank) throws Exception {
        if (volumeVoter < 0) {
            throw new MyExVoter();
        } else if (volumeCoffee < 0) {
            throw new MyExCoffee();
        } else if (tank > getTankVolume()) {
            throw new MyExTank();
        } else if (milkTank <= 0) {
            throw new MyExMilk();
        }
    }

}
