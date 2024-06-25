import java.util.PriorityQueue;

public class minimum_cost {
    public static long MinimumCost(long arr[], int n){
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }

        int res = 0;
        while (pq.size() > 1) {
            long first = pq.poll();
            long second = pq.poll();
            res += first + second;
            pq.add(first + second);
        }

        return res;
    }
    public static void main(String[] args) {
        long arr[] = {4, 3, 2, 6};
        int n = 4;
        System.out.println(MinimumCost(arr, n));
    }
}
