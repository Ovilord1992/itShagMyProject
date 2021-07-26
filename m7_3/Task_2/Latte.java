package DZ.Task_2;

import DZ.Task_1.Coffee;

public class Latte implements Coffee {
    int voter;
    int coffee;
    int milk;

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

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public Latte(int voter, int coffee, int milk) {
        this.voter = voter;
        this.coffee = coffee;
        this.milk = milk;
    }

    @Override
    public void makeCoffee() {
        System.out.println("латте готов");
    }
}
