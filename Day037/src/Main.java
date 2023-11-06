import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        String webSite = CompletableFuture.supplyAsync(Main::getWebSite)
                .completeOnTimeout("https://twitter.com/hacisimsek_dev", 5, SECONDS)
                .get();

        System.out.println(webSite);
    }

    private static String getWebSite() {
        try {
            Thread.sleep(10_000);
            return "thegreatapi.com";
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}