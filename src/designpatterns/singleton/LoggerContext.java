package designpatterns.singleton;


public class LoggerContext {

    public static void runSingletonExample(){

        Logger logger = Logger.getLoggerInstance();
        Logger logger1 =Logger.getLoggerInstance();

        System.out.println(logger1+" "+logger);

        Logger logger2 = Logger.getLazyLoggerInstance();
        Logger logger3 = Logger.getLazyLoggerInstance();

        System.out.println(logger2+" "+logger3);
    }
}
