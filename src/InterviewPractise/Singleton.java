package InterviewPractise;

public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
        System.out.println("ctor accessed by "+
                Thread.currentThread().getName());
    }

    public static  Singleton getInstance(){
        if(instance==null) {
            synchronized (Singleton.class) {
                if(instance==null)
                instance = new Singleton();
            }
        }
        return instance;
    }

    public static  synchronized  Singleton getSyncInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
