import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Instead of always running the expensive method
        // LOGGER.info(veryExpensiveStringCreation());

        // Pass the method reference so that it is called only when and if necessary
        LOGGER.info(Main::veryExpensiveStringCreation);
    }

    private static String veryExpensiveStringCreation() {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            //TODO: handle properly
        }
        return "thegreatapi.com";
    }
}