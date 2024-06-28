import java.util.Collections;
import java.util.PriorityQueue;

public class kth_smallest_element{
    public static int Smallestk_ele(int arr[], int k){
        //using min heap
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        // for(int i = 0; i < arr.length; i++){
        //     pq.add(arr[i]);
        // }

        // int j = 0;
        // int ele = Integer.MIN_VALUE;
        // while(j < k){
        //     ele = Math.max(pq.remove(), ele);
        //     j++;
        // }

        // return ele;

        //using max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int ele: arr) {
            pq.add(ele);
            if (pq.size() > k) pq.remove();
        }

        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, 3, 8, -4, -2, 6};
        int k = 3;
        System.out.println(Smallestk_ele(arr, k));
    }
}