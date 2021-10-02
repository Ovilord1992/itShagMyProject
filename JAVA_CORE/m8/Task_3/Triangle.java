package Task_3;

public final class Triangle {
    private final int a, b, c;

    public Triangle(int a, int b, int c) throws Exception{
        this.a = a;
        this.b = b;
        this.c = c;
        if (a + b < c || a + c < b || b + c < a){
           throw new  Exception();
        }
    }
}
