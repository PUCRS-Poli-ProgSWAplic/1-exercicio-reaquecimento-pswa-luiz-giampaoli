package logger;
public class LoggerFactory {

    public static Logger getLogger(String loggerType) {
        if (loggerType == "arquivo") {
            return new FileLogger();
        }

        if (loggerType == "console") {
            return new ConsoleLogger();
        }

        return null;
    }
}
