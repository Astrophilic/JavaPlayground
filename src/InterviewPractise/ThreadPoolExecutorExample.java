package InterviewPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {

    private int threadCount;

    public ThreadPoolExecutorExample(int threadCount) {
        this.threadCount = threadCount;
    }

    public long runExample(List<Integer> arrayList){
        int elements= arrayList.size();

        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);

        int chunkSize= elements/threadCount;
        int remaining = elements%threadCount;


        List<Caclulator>calculatorList = new ArrayList<>();

        int prevEnd=0;
        Caclulator.setArrayList(arrayList);
        for(int i=0;i<threadCount;i++){
            int startIndex=prevEnd;
            int endIndex = startIndex+chunkSize;
            if(i==threadCount-1){
                endIndex=elements;
            }
            Caclulator caclulator = new Caclulator(startIndex,endIndex);
            calculatorList.add(caclulator);
            prevEnd=endIndex;
        }

        for(int i=0;i<threadCount;i++){
            executorService.execute(calculatorList.get(i));
            }
        executorService.shutdown();
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long sum=0;
        for(Caclulator caclulator:calculatorList){
            long currentSum = caclulator.getSum();
            System.out.println("current sum is "+currentSum);
            sum+=currentSum;
        }

        System.out.println("Total sum by threads is "+sum);

        return sum;


    }
}
