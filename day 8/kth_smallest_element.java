// package day 8;

import java.util.Arrays;

public class kth_smallest_element {
    public static int kthSmallest(int arr[], int k){
        // int minv = Integer.MIN_VALUE;

        int element = 0;
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            element = arr[k-1];
        }
        return element;
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(kthSmallest(arr, k));
    }
}
