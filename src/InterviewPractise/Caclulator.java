package InterviewPractise;

import java.util.List;

public class Caclulator implements Runnable {
    private static  List<Integer> arrayList;
    private final int startIndex;
    private final int endIndex;
    private long sum;


    public Caclulator( int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.sum=0;
    }

    public static void setArrayList(List<Integer> array) {
        arrayList=array;
    }

    public long getSum(){
        return this.sum;
    }

    @Override
    public void run() {
         calculateSum();
    }

    private void calculateSum() {
        sum=0;
        for (int i = startIndex ; i <endIndex ; i++) {
            sum+=arrayList.get(i);

        }
    }
}
