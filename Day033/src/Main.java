import java.io.File;

public class Main {
    public static final String JAVA_SUFFIX = File.separator + "java";

    public static void main(String[] args) {
        ProcessHandle.allProcesses()
                .filter(Main::isJavaProcess)
                .map(ProcessHandle::info)
                .forEach(System.out::println);
    }

    private static boolean isJavaProcess(ProcessHandle processHandle) {
        return processHandle.info()
                .command()
                .map(command -> command.endsWith(JAVA_SUFFIX))
                .orElse(false);
    }
}