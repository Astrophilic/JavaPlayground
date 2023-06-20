package algorithms.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Knapsack {
    int knapsackCapacity;
    List<Integer> weights;

    List<Integer>values;

    public Knapsack(int knapsackCapacity, List<Integer> weights, List<Integer> values) {
        this.knapsackCapacity = knapsackCapacity;
        this.weights = weights;
        this.values = values;
    }

    public void getMaximumValue(){

        int n=weights.size();

        int [][]dp = new int[n+1][knapsackCapacity+1];


        for(int i=0;i<=n;i++){
            for(int j=0;j<=knapsackCapacity;j++){
                dp[i][j]=0;
            }
        }

        for(int i=1;i<=n;i++){
            for(int w=1;w<=knapsackCapacity;w++){
                if(weights.get(i-1)<=w){
                    dp[i][w]=Math.max(dp[i-1][w],values.get(i-1)+dp[i-1][w-weights.get(i-1)]);
                }
                else{
                    dp[i][w]=dp[i-1][w];
                }
            }
        }

        int result= dp[n][knapsackCapacity];
        System.out.println("The knapsack max value we can get is "+result);

    }

    public static void runKnapackExample(){
        List<Integer> weights = new ArrayList<>();
        weights.add(4);
        weights.add(5);
        weights.add(1);

        List<Integer>values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        Knapsack knapsack = new Knapsack(4,weights,values);
        knapsack.getMaximumValue();
    }
}
