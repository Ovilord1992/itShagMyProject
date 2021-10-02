package DZ.Task_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar {
    private String date;
    private String day;
    private long MILES_PER_DAY = 86400000L;
    private long a;
    private long b;
    public SimpleDateFormat s = new SimpleDateFormat("d, MM, yy");

    public String getDaneNoy() {
       Date date = new Date();
       a = date.getTime();
       return s.format(date);
    }


    public String dataVidoch() throws ParseException {
        Date d = s.parse(date);
        String st = s.format(d);
        b = d.getTime();
        return st;
    }

    public String prosrochka(){
        getDaneNoy();
        long z = (a - (b + Long.parseLong(day) * MILES_PER_DAY)) / MILES_PER_DAY;
        String str = z + "";
        if (z < 0){
            return " до просрочки " + str.substring(1,str.length()) + " день";
        }
        return "просрочено на " + str;
    }

    public Calendar(){}

    public Calendar(String date, String day) {
        this.date = date;
        this.day = day;
    }







}
