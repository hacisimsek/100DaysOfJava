import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("one");
        originalList.add("two");
        originalList.add("three");
        System.out.println(originalList);
        List<String> copy = Collections.unmodifiableList(originalList);
        System.out.println(copy);
        originalList.remove("two");

        System.out.println(copy);

    }
}