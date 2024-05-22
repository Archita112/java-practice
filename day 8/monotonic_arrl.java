// package day 8;

public class monotonic_arrl {
    public static boolean Checkmonotonic_arr(int nums[]){
        boolean increasing = true;
        boolean decreasing = true;
        for(int i = 0; i<nums.length-1; i++){
            if (nums[i] > nums[i+1]) {
                increasing = false;
            }
            else if(nums[i] < nums[i+1]){
                decreasing = false;
            }

            if (!increasing && !decreasing) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {1, 3, 2};
        System.out.println(Checkmonotonic_arr(nums));
    }
}
