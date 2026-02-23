import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryService {

    ArrayList<Book> books;
    Scanner sc = new Scanner(System.in);

    public LibraryService() {

        books = loadBooks();

    }

    public void addBook() {

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));

        saveBooks();

        System.out.println("Book Added Successfully");
    }

    public void showBooks() {

        if (books.isEmpty()) {

            System.out.println("No Books Available");
            return;
        }

        for (Book b : books) {

            System.out.println(b.id + " | " + b.title + " | " + b.author + " | Issued: " + b.issued);

        }

    }

    public void issueBook() {

        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();

        for (Book b : books) {

            if (b.id == id && !b.issued) {

                b.issued = true;
                b.issueDate = LocalDate.now();

                saveBooks();

                System.out.println("Book Issued Successfully on " + b.issueDate);
                return;
            }

        }

        System.out.println("Book Not Available");
    }

    public void returnBook() {

        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();

        for (Book b : books) {

            if (b.id == id && b.issued) {

                LocalDate returnDate = LocalDate.now();

                long days = ChronoUnit.DAYS.between(b.issueDate, returnDate);

                long fine = 0;

                if (days > 7) {

                    fine = (days - 7) * 5;

                }

                System.out.println("Book Returned on " + returnDate);
                System.out.println("Total Days: " + days);

                if (fine > 0) {

                    System.out.println("Fine to Pay: ₹" + fine);

                } else {

                    System.out.println("No Fine");

                }

                b.issued = false;
                b.issueDate = null;

                saveBooks();

                return;
            }

        }

        System.out.println("Invalid Book ID");
    }

    public void searchBook() {

        sc.nextLine();

        System.out.print("Enter Book Title to search: ");
        String title = sc.nextLine();

        boolean found = false;

        for (Book b : books) {

            if (b.title.equalsIgnoreCase(title)) {

                System.out.println("Book Found:");
                System.out.println(b.id + " | " + b.title + " | " + b.author);

                found = true;

            }

        }

        if (!found) {

            System.out.println("Book Not Found");

        }

    }

    private void saveBooks() {

        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"));

            oos.writeObject(books);

            oos.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private ArrayList<Book> loadBooks() {

        try {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"));

            ArrayList<Book> list = (ArrayList<Book>) ois.readObject();

            ois.close();

            return list;

        } catch (Exception e) {

            return new ArrayList<>();

        }

    }

}