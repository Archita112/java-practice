// import java.util.*;

public class pair_sum1 {
    public static int SumofPairs(int arr[], int k){
        int lp = 0;
        int sum = 0;
        int rp = arr.length-1;
        // Arrays.sort(arr);

        // for(int i = 0; i<arr.length; i++){
            while (lp < rp) {
                if (arr[lp] + arr[rp] == k) {
                    sum++;
                    lp++;
                    rp--;
                } else if(arr[lp] + arr[rp] < k){
                    lp++;
                }
                else{
                    rp--;
                }
            }
        // }
        if(sum == 0) return -1;
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 1};
        int k = 6;

        System.out.println(SumofPairs(arr, k));
    }
}
