// package day 6;

import java.util.Arrays;

public class chocolate_distribution_problem {
    public static int solution(int nums[],int n, int m){
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i< n-m; i++){
            int diff_in = nums[i+m-1] - nums[i];
            diff = Math.min(diff, diff_in);
            // System.out.println(" minimum number is for this iteration is - " +diff);
        }
        return diff;
    }
    public static void main(String[] args) {
        int nums[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        int n = nums.length;
        System.out.println(solution(nums, n, m));
    }
}
