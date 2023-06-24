import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {

        showMessage("John", "Doe");
        showMessage("Jane", "Doe");
        showMessage("John", "Smith");
        showMessage("Jane", "Smith");
    }

    private static void showMessage(String param1, String param2) {
        String message = MessageFormat.format("Hello {0} {1}", param1, param2);
        System.out.println(message);
    }
}