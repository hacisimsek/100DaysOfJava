import java.security.SecureRandom;
import java.util.stream.Stream;

public class Main {
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static void main(String[] args) {
        Stream.generate(() -> SECURE_RANDOM.nextInt(99) + 1)
                .forEach(System.out::println);
    }
}