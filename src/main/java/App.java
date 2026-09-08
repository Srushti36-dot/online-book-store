public class App {

    public static String login(String username, String password) {

        if (username.equals("admin") && password.equals("1234")) {
            return "Login successful";
        }

        return "Invalid username or password";
    }

    public static void main(String[] args) {
        System.out.println(login("admin", "1234"));
        System.out.println("CI Pipeline Test Successful");
    }
}