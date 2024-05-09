//using kadane's algo

public class max_subarr_sum3 {
    public static int kadanes_algo(int arr[]){
        int currs = 0;
        int maxs = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            currs += arr[i];
            if (currs < 0) {
                currs = 0;
            }

            if (currs > maxs) {
                maxs = currs;
            }
        }
        
        System.out.println("maximum sum is " + maxs);
        return maxs;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes_algo(arr);
    }
}