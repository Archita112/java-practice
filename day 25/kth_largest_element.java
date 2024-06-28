import java.util.PriorityQueue;

public class kth_largest_element {
    public static int Largestk_element(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int ele: arr) {
            pq.add(ele);
            if (pq.size() > k) pq.remove();
        }

        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, 3, 8, -4, -2, 6};
        int k = 5;
        System.out.println(Largestk_element(arr, k));
    }
}
