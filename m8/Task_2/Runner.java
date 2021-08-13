package Task_2;

public class Runner {
    public static void main(String[] args) throws Exception {
        num(-1);
    }

    public static void num(int a) throws Exception {
        if (a < 0){
            throw new Ex();
        } else if(a > 100){
            throw new RunTEx();
        }
    }
}
