import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(max(Arrays.asList(3, 5, 1, 2, 4)));
    }

    private static Integer max(List<Integer> list) {
        Integer max = null;
        for (Integer i : list) {
            if (max == null || i > max) {
                max = i;
            }
        }
        return max;
    }
}