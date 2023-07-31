import java.util.regex.Pattern;

public class Main {
    private static final Pattern PATTERN = Pattern.compile(", ");

    public static void main(String[] args) {
        System.out.println("Simple split: ");
        for(String s : simpleSplit()) {
            System.out.println(s);
        }

        System.out.println("Performant split: ");
        for(String s : performantSplit()) {
            System.out.println(s);
        }
    }

    private static String[] performantSplit() {
        return PATTERN.split("id, name, country, gender");
    }

    private static String[] simpleSplit() {
        return "id, name, country, gender".split(" ");
    }
}