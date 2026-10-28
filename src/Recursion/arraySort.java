package Recursion;

public class arraySort {
    static boolean isSorted(int []arr, int si) {
        if(si==arr.length-1) return true;

        if(arr[si]>arr[si+1]){
            return false;
        }else{
            return isSorted(arr, si+1);
        }
    }

    static void main(String[] args) {
        int[] arr = {3,5,78,300,850,3000};
        System.out.println("Array sort status: "+isSorted(arr,0));
    }
}
