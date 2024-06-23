import java.util.LinkedList;
import java.util.*;

public class first_negative_number {
    public static long[] printFirstNegativeInteger(long A[], int N, int K){
        Queue<Integer> q = new LinkedList<>();

        //add index of negative elements in the queue
        for(int i = 0; i < A.length; i++){
            if (A[i] < 0) {
                q.add(i);
            }
        }

        long res[] = new long[N-K+1];
        for(int i = 0; i < N-K+1; i++){
            if (q.size() != 0 && q.peek() < i) {
                q.remove();
            }
            if (q.size() != 0 && q.peek() <= i+K-1) {
                res[i] = A[q.peek()];
            }
        }

        // for(int i = 0; i < res.length; i++){
        //     System.out.print(res[i] + " ");
        // }
        return res;
    }
    public static void main(String[] args) {
        long A[] = {-8, 2, 3, -6, 10};
        int N = 5;
        int K = 2;
        printFirstNegativeInteger(A, N, K);
    }
}
