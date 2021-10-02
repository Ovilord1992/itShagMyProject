package DZ.Task_1;

public class Ecspresso implements Coffee{
    int coffee;
    int voter;

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getVoter() {
        return voter;
    }

    public void setVoter(int voter) {
        this.voter = voter;
    }

    public Ecspresso(int coffee, int voter) {
        this.coffee = coffee;
        this.voter = voter;
    }

    @Override
    public void makeCoffee() {
        System.out.println("экспрессо готов");
    }
}
