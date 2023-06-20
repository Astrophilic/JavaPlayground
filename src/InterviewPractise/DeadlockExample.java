package InterviewPractise;

public class DeadlockExample {
    final Object resource= new Object() ;
    final Object secondResource = new Object();


    public void runExample(){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource){
                    System.out.println("acquired resource in "+Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (secondResource){
                        System.out.println("Acquired secondResource "+Thread.currentThread().getName());
                        System.out.println("performing operation");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (secondResource){
                    System.out.println("acquiring secondResouce"+Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (resource){
                        System.out.println("acquiring resource in "+Thread.currentThread().getName());
                        System.out.println("perorming task");
                    }
                }
            }
        });
        t1.start();
        t2.start();



        if(t1.isAlive()){
            System.out.println(t1.getState());
        }
        if(t2.isAlive()){
            System.out.println(t2.getState());
        }
    }
}
