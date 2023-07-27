import java.security.SecureRandom;
//Day 1 - Generating a random number within a specific range.
public class Main {
    public static final SecureRandom random = new SecureRandom();

    public static int randomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
    public static void main(String[] args) {

        System.out.println("Generating random numbers between 1 and 10");
        System.out.println("==========================================");
        System.out.println("Random number: " + randomInt(1, 10));
    }
}