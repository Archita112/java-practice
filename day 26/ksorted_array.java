import java.util.ArrayList;
import java.util.PriorityQueue;

public class ksorted_array{
    public static ArrayList<Integer> KSortedArray(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }

        int j = 0;
        while(j < arr.length){
            al.add(pq.remove());
            j++;
        }

        for(int i = 0; i < al.size(); i++){
            System.out.print(al.get(i) + " ");
        }

        return al;
    }
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        KSortedArray(arr, k);
    }
}