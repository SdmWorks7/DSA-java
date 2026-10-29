package Recursion;

import java.util.Arrays;

public class bubbleSort {
    static void bubbleSort(int[] arr, int si, int li){
        if(li==0) return;
        if(si==li){
            bubbleSort(arr, 0,li-1);
            return;
        }
        if(arr[si]>arr[si+1]){
            int t = arr[si];
            arr[si] = arr[si+1];
            arr[si+1]=t;
        }
        bubbleSort(arr, si+1, li);
    }
    static void main(String[] args) {
        int[] arr = {3, 5, 78, 300, 850, 3000};
       bubbleSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
