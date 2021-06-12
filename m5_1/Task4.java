package ItShag.itShagMyProject.m5_1;

public class Task4 {
    public static void main(String[] args) {
        String[] a = "я очень хотел юы разузнать узнат занята ли ты сегодня обязательно перезвони мне".split(" ");
        StringBuilder q = new StringBuilder();
        for (String k: a) {
            if (k.length() > 2) {
                String z = k.substring(0, 1).replace("[уеыаоэяию]", "");
                String v = k.substring(k.charAt(k.length()-1)).replace("[цкнгшщзхфвпрлджчсмтб]", "");
                if (z.length() == 0 && v.length() == 0){
                    q.append(k).append(" ");
                }
                System.out.println(k.charAt(k.length()-1));
            }

        }
        System.out.println(q);
    }
}
