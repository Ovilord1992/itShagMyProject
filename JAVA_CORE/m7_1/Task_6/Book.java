package DZ.Task_6;

public class Book {
    private String autor;
    private String nameBook;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Book(String autor, String nameBook) {
        this.autor = autor;
        this.nameBook = nameBook;
    }
}
