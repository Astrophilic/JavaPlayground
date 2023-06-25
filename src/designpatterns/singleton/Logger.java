package designpatterns.singleton;


public class Logger {

    private static volatile  Logger loggerInstance;
    private Logger(){

    }

    private static class LazyHolder{
        private static final Logger lazyInstance = new Logger();
    }
    // double check locking using synchronized block to avoid issues in multithreaded environment.
    public static Logger getLoggerInstance(){
        if(loggerInstance==null){
            synchronized (Logger.class){
                if(loggerInstance==null){
                    loggerInstance = new Logger();
                    return loggerInstance;
                }
            }
        }
        return loggerInstance;
    }

    public static Logger getLazyLoggerInstance(){
        return LazyHolder.lazyInstance;
    }
}
