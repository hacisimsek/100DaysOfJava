import javax.annotation.Nonnull;

public final class Main {
    private Main() {

    }
    public static void main(String[] args) {
       printLength(null);
    }
    public static void printLength(@Nonnull String s) {
        System.out.println(s.length());
    }
}