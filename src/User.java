public class User {

    int userId;
    String name;
    String email;

    public User(int userId, String name, String email) {

        this.userId = userId;
        this.name = name;
        this.email = email;

    }

    public void displayUser() {

        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);

    }

}
