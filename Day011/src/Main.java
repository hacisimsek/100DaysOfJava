import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("z", 10);
        unsortedMap.put("b", 5);
        unsortedMap.put("a", 6);
        unsortedMap.put("c", 20);
        
        Map<String, Integer> sortedMap = sortByValue(unsortedMap);
        System.out.println(sortedMap);
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortedMap) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(x -> sortedMap.put(x.getKey(), x.getValue()));
        return Collections.unmodifiableMap(sortedMap);
    }
}