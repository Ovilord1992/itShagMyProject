package DZ.Task_4;

public class MainString {
    private char[] symbol;
    private int symbolLenth;
    private String str;

    public MainString() {
    }

    public MainString(char symbol) {
        this.symbol[0] = symbol;
    }

    public MainString(String str) {
        this.str = str;
    }

    public int lenthStr() {
        return str.length();
    }

    public void cleanStr() {
        this.str = "";
    }

    public String serchSymbol(char ch) {
        int count = 0;
        char[] a = str.toCharArray();
        StringBuilder str1 = new StringBuilder();
        for (char i: a) {
            if (i == ch) {
                str1.append(count).append(" ");
            };
            count++;

        }
        return str1.toString();

    }
}
