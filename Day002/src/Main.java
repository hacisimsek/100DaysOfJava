import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//Day 2 - Formatting a LocalDateTime object.
public class Main {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String formatDateTime = now.format(formatter);
        System.out.println("Before : " + formatDateTime);
    }
}