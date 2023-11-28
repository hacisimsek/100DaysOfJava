public class MyServiceFactory {
    private MyServiceFactory() {
    }
    public static MyService createMyService() {
        return new MyServiceImpl();
    }
}
