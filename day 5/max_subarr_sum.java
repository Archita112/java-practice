//bruteforce approach

// import java.util.*;

public class max_subarr_sum {
    public static int max_sum(int nums[]){
        int maxsv = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0; i< n; i++){
            for(int j = i; j<n; j++){
                for(int l = i; l <= j; l++){
                    System.out.print( nums[l] + " ");
                }
                int currs = 0;
                for(int k = i; k<=j; k++){
                    currs += nums[k];
                }
                System.out.println();
                System.out.println("current sum for this sub array is " + currs);

                if (currs > maxsv) {
                    maxsv = currs;
                }
            }
            System.out.println();
        }
        System.out.println("maximum sum is " + maxsv);
        return 0;
    }
    public static void main(String[] args) {
        int nums[] = {1, -2, 6, -1, 3};
        max_sum(nums);
    }
}
