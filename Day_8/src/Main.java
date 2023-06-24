import java.security.SecureRandom;
import java.text.MessageFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void main(String[] args) {

        LOGGER.info("Creating a thread pool with 5 threads");
        ExecutorService executor = Executors.newFixedThreadPool(5);

        LOGGER.info("Starting tasks submissions");
        try {
            for (int i = 0; i < 15; i++) {
                int taskId = i;
                LOGGER.info(()-> MessageFormat.format("Submitting task {0} to the executor", taskId));
                executor.submit(() -> task(taskId));
            }
        } finally {
            LOGGER.info("Shutting down the executor");
            executor.shutdown();
        }
    }
    private static void task(int taskId) {
            LOGGER.info(()-> MessageFormat.format("Running task {0}", taskId));
            simulateLongProcessing();
            LOGGER.info(()-> MessageFormat.format("Task {0} has finished", taskId));
    }

    private static void simulateLongProcessing() {
        try {
            Thread.sleep((RANDOM.nextInt(3) + 10) * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(MessageFormat.format("Thread {0} has been interrupted", Thread.currentThread().getName()), e);
        }
    }
}