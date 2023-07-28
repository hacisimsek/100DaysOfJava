import java.time.LocalDateTime;

public final class Main {
    private final LocalDateTime time;
    private Main(LocalDateTime time) {
        this.time = time;
    }
    public LocalDateTime getTime() {
        return time;
    }
    public static Main getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private static final class InstanceHolder {
        static final Main INSTANCE = new Main(LocalDateTime.now());
    }

}