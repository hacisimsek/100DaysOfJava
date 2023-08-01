
public class Main {
    public static void main(String[] args) {
        String helloWord = "Hello world!";
        String reversed = new StringBuilder(helloWord).reverse().toString();
        System.out.println(reversed);
    }
}