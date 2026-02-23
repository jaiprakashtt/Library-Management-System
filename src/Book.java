import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {

    int id;
    String title;
    String author;
    boolean issued;
    LocalDate issueDate;

    public Book(int id, String title, String author) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
        this.issueDate = null;

    }

}