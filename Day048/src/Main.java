import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // Instead of doing:
        // Function<Integer, Integer> multiplyBy2 = i -> i * 2;

        // Just do:
        UnaryOperator<Integer> multiplyBy2 = i -> i * 2;

        System.out.println(multiplyBy2.apply(3));
    }
}