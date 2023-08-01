import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(5, "E");
        map.put(2, "B");
        map.put(3, "C");
        map.put(1, "A");
        map.put(4, "D");

        System.out.println(map);


        map.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("Sort by key");
        //sort by key
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}