package logger;

public class FileLogger implements Logger {

    FileLogger() {}

    public void log(String message) {
        System.out.println("[FILE LOGGER] " + message);
    }
}
