import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Instead of doing:
        Map<Integer, List<Integer>> map1 = new HashMap<Integer, List<Integer>>();

        // Just do:
        Map<Integer, List<Integer>> map2 = new HashMap<>();
    }
}