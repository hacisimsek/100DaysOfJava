import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        String result = map(randomNumber());
        System.out.println(result);
    }

    private static String map(int number) {
        return switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "unknown";
        };
    }

    private static int randomNumber() {
        return new SecureRandom().nextInt(4);
    }
}