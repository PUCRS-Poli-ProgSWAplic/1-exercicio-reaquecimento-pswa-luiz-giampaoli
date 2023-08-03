import logger.Logger;
import logger.LoggerFactory;

public class Main {
    public static void main(String[] args) {

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

//        for (int i = 0; i < 10; i++) {
//            Incremental inc = Incremental.getInstance();
//            System.out.println(inc);
//        }

