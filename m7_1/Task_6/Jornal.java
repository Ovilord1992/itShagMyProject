package DZ.Task_6;

public class Jornal {
    private String date;
    private int timeOfUse;
    Calendar calendar;

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Jornal(Calendar calendar, Bilet bilet, Book book) {
        this.calendar = calendar;
        this.bilet = bilet;
        this.book = book;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String  date) {
        this.date = date;
    }

    public int getTimeOfUse() {
        return timeOfUse;
    }

    public void setTimeOfUse(int timeOfUse) {
        this.timeOfUse = timeOfUse;
    }

    public Bilet getBilet() {
        return bilet;
    }

    public void setBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    Bilet bilet;
    Book book;


}
