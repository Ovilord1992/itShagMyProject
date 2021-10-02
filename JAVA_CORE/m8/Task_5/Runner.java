package Task_5;

import java.io.IOException;
import java.util.Random;

public class Runner {
    private static final Random rnd = new Random();

    public void halt() throws IOException {
        if (rnd.nextBoolean()) {
            throw new RuntimeException();
        }
        else{
            throw new IOException();
        }
    }

    public static void main(String[] args) throws Exception {
        Runner runner = new Runner();
        try {
            runner.halt();
        }catch (RuntimeException runtimeException){
            System.out.println("halt");
        }catch (Exception e){
            throw new Exception();
        }

    }
}
