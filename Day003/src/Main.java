import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
//Day 3 - Scheduling a task to run every 2 seconds.
public class Main {
    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    public static void main(String[] args) {

        Main main = new Main();
        main.printCurrentTimeEvery2Seconds();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        main.stopPrinting();
    }

    public void printCurrentTimeEvery2Seconds() {
        Runnable task = () -> System.out.println("Current time: " + System.currentTimeMillis());
        scheduler.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }
    public void stopPrinting() {
        scheduler.shutdown();
    }

}