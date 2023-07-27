import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try {
            Callable<Integer> callable = Main::doAlongCalculation;
            Future<Integer> future = executorService.submit(callable);

            doOtherThingWhileCalculating();

            LOGGER.info("Will get the calculated value. Note that the value will be get immediately");
            LOGGER.info("Calculated value: " + future.isDone());
            throw new ExecutionException("Error", new Exception());
        }catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();

        }
        System.out.println("Hello world!");
    }
    private static int doAlongCalculation() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 42;
    }
    private static void doOtherThingWhileCalculating()  {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}