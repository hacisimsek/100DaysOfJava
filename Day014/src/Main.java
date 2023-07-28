import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BigDecimal(1.23));

        System.out.println(new BigDecimal("1.23"));

        System.out.println(BigDecimal.valueOf(1.23));
    }
}