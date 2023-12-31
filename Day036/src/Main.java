import javax.annotation.Nullable;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String s = Objects.requireNonNullElse(doStuff(), "not found");

        // Will print 'not found'
        System.out.println(s);
    }

    @Nullable
    private static String doStuff() {
        return null;
    }
}