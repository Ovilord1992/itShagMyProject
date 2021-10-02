package DZ.Task_2;


import java.util.ArrayList;
import java.util.List;

public class Peresechenie {
    static List<Integer> list = new ArrayList<>();
    static String outPeres = "";

    public String getDdd() {
        return outPeres;
    }

    public void parser(int k, int l){
        list.add(k);
        list.add(l);
    }

    public void parser(){
        for (int i = 0; i < list.size(); i += 2) {
            for (int j = 2; j < list.size(); j += 2) {
                if (list.get(i) < list.get(j)){
                    if (list.get(i+1) > list.get(j)){
                        outPeres += (i/2 + 1) + " пересекается с " + (j/2 + 1) + " ";
                    }
                }
            }

        }
    }


}
