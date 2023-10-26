public class Main {
    public static void main(String[] args) {
        Number n = 6;
        if (n instanceof Integer) {
            Integer i = (Integer) n;
            print(i);
        }
        if (n instanceof Integer i) {
            print(i);
        }
    }
    private static void print(Integer i) {
        System.out.println(i);
    }
}