import logger.Logger;
import logger.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        runIncrementalDemoEx1();

        runLoggerDemoEx2();
    }

    public static void runIncrementalDemoEx1() {
        for (int i = 0; i < 10; i++) {
            Incremental inc = Incremental.getInstance();
            System.out.println(inc);
        }
    }

    public static void runLoggerDemoEx2() {
        Logger fileLogger = LoggerFactory.getLogger("arquivo");

        for (int x=1; x<=10; x++) {
            fileLogger.log(Integer.toString(x));
        }

        Logger consoleLogger = LoggerFactory.getLogger("console");

        for (int x=1; x<=10; x++) {
            consoleLogger.log(Integer.toString(x));
        }
    }
}


