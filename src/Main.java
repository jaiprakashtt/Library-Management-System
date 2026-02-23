import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryService library = new LibraryService();
        AdminService admin = new AdminService();

        if (admin.login()) {

            while (true) {

                System.out.println("\n===== Library Management System =====");
                System.out.println("1 Add Book");
                System.out.println("2 Show Books");
                System.out.println("3 Issue Book");
                System.out.println("4 Return Book");
                System.out.println("5 Search Book");
                System.out.println("6 Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        library.addBook();
                        break;

                    case 2:
                        library.showBooks();
                        break;

                    case 3:
                        library.issueBook();
                        break;

                    case 4:
                        library.returnBook();
                        break;

                    case 5:
                        library.searchBook();
                        break;

                    case 6:
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }
            }
        }
    }
}