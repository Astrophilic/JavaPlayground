package InterviewPractise;

import java.util.ArrayList;

public class ProducerConsumerExample {

    private static int BUFFER_SIZE;
    private static final ArrayList<Integer> buffer = new ArrayList<>();
    public ProducerConsumerExample(final int size) {
        BUFFER_SIZE=size;
    }

    public void runExample(){

        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    synchronized (buffer) {
                        while (buffer.size() == BUFFER_SIZE) {
                            try {
                                buffer.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                            System.out.println("Produced item = " + i);
                            buffer.add(i);
                            buffer.notify();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }


                        }
                    }
            }

        });

        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    synchronized (buffer) {
                        while (buffer.isEmpty()) {
                            try {
                                buffer.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        }
                        System.out.println("consuming item from beginning");
                        Integer item = buffer.get(0);
                        System.out.println("consuming item " + item);
                        buffer.remove(0);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        buffer.notify();
                    }
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
