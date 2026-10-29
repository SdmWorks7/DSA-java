package Recursion;

import static Recursion.arraySort.isSorted;

public class linearSearch {
    static int search(int[] arr, int si, int data) {
        if (si == arr.length) return -1;
        int ans = search(arr, si+1, data);
        if (arr[si]==data) {
            return si;
        } else {
            return ans;
        }
    }

    static void main(String[] args) {
        int[] arr = {3, 5, 78, 300, 850, 3000};
        System.out.println("Data found at: " + search(arr, 0, 3000));
    }
}
