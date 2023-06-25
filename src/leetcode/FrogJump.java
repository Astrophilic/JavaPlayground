package leetcode;


import java.util.*;


/***
 * https://leetcode.com/problems/frog-jump/
 */
public class FrogJump  {

    private static class Pair{
        private int first;

        private int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return first == pair.first && second == pair.second;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }

    boolean canCrossUtil(int currentPos, int k, int dest, Set<Integer> stonesSet, Map<Pair,Boolean> dp){

        if(k<=0 || currentPos>dest || !stonesSet.contains(currentPos)){
            return false;
        }
        if(dp.containsKey(new Pair(currentPos,k))){
            return dp.get(new Pair(currentPos,k));
        }
        if(currentPos==dest){
            return true;
        }
        boolean canCross=false;
        int []steps ={-1,0,1};

        for(int step:steps){
            canCross = canCrossUtil(currentPos+k+step,k+step,dest,stonesSet,dp);
            if(canCross){
                dp.put(new Pair(currentPos,k),true);
                return true;

            }
        }
        dp.put(new Pair(currentPos,k),false);
        return false;

    }
    public boolean canCross(int[] stones) {
        Set<Integer>stonesSet = new HashSet<>();
        Map<Pair,Boolean>dp = new HashMap<>();
        for(int i=0;i<stones.length;i++){
            stonesSet.add(stones[i]);
        }
        int dest=stones[stones.length-1];
        if(stones[1]>1){
            return false;
        }
        return canCrossUtil(stones[1],1,dest,stonesSet,dp);
    }
}
