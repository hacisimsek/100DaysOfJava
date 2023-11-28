public class Main {
    public static void main(String[] args) {
        MyService myService = MyServiceFactory.createMyService();
        myService.run();
    }
}