package algorithms.sorting;

import java.util.Scanner;

public class MergeSort {
    private int size;
    int []arr;


    public MergeSort(int size) {
        this.size = size;
        this.arr = new int[size];
        takeInput();
    }

    private void takeInput() {
        System.out.printf("enter %d elements",this.size);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {


            arr[i]=sc.nextInt();

        }
        sort();
    }
    public void sort(){
        doSort(0,size-1);
        printInput();
    }

    private void doSort(int start, int end) {

        if(start==end){
            return;
        }
        int mid = (start+end)/2;

        doSort(start,mid);
        doSort(mid+1,end);
        merge(start,mid,end);
    }

    private void merge(int start, int mid, int end) {

        int elements = end-start+1;
        int []temp = new int[elements];

        int i =start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        k=0;
        for (int l = start; l <=end; l++) {
            arr[l]=temp[k++];
        }
    }

    private void printInput() {
        System.out.println("printing the array");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }
    }
}
