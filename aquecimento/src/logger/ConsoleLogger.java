package logger;

public class ConsoleLogger implements Logger {

    public ConsoleLogger() {

    }

    public void log(String message) {
        System.out.println("[CONSOLE LOGGER] " + message);
    }
}
