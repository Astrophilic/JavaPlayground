package InterviewPractise;

import java.util.*;

public class SolutionGreedy {


    public static void runExample() {

        System.out.println("input size");
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        int[] arr = new int[n];
        int[] dep = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i]=sc.nextInt();
            dep[i]=sc.nextInt();

        }

        int platform = findPlatform(arr, dep, n);
        System.out.println("platforms = "+platform);
    }


    public static class Pair{
        private int start;
        private int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
    static int findPlatform(int []arr,int dep[], int n){

        ArrayList<Pair> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(new Pair(arr[i],dep[i]));
        }
        arrayList.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.start - o2.start;
            }
        });

        int maxPlatforms =0;

        PriorityQueue<Pair>pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.end!=o2.end){
                    return o1.end-o2.end;
                }
                return o1.start-o1.end;
            }
        });

        for (Pair p: arrayList
             ) {

            while(!pq.isEmpty() && pq.peek().getEnd()<p.getStart()){
                pq.poll();
            }
            pq.offer(p);
            maxPlatforms= Math.max(maxPlatforms,pq.size());
        }
        return maxPlatforms;

    }

}
