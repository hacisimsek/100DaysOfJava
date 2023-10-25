import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        var properties = new Properties();
        try(var reader = Main.class.getClassLoader().getResourceAsStream("config.properties")) {
            properties.load(reader);
        }
        System.out.println(properties);
    }
}