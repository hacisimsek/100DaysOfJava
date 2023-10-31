import java.time.LocalTime;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<LocalTime> optionalValue = getOptionalValue();
        System.out.println(optionalValue.get());
        System.out.println(getOptionalValue().orElseThrow());
    }

    private static Optional<LocalTime> getOptionalValue() {
        return Optional.of(LocalTime.now());
    }
}