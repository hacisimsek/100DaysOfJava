import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> originalList = List.of(3, 1, 5, 2, 4, 1, 5, 3, 5, 2, 6);
        List<Integer> distinctElementsList = originalList.stream().distinct().toList();

        System.out.println(distinctElementsList);
    }
}