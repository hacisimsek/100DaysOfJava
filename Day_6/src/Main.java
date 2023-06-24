
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.logging.Logger;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        CompletableFuture.runAsync(Main::task);
        LOGGER.info("Main thread is running");
        LOGGER.info("Waiting for the async task to end.");

        boolean isQuiecent = ForkJoinPool.commonPool().awaitQuiescence(5, SECONDS);
        if(isQuiecent) {
            LOGGER.info("Async task is done.");
        } else {
            LOGGER.info("Async task is not done.");
        }
    }

    private static void task() {
        LOGGER.info("Async task is running");
        try {
            Thread.sleep(1000);
            LOGGER.info("Async task is done");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOGGER.info("Async task is interrupted");
        }
    }
}