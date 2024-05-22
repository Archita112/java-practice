// package day 8;

public class most_freq_num {
    public static int Check_mostfreqnum(int nums[], int key){
        // int mini = Integer.MIN_VALUE;
        // for(int i = 0; i<nums.length-1; i++){
        //     if (nums[i] == key) {
        //         // mini = Math.max(mini, nums[i+1]);
        //         return nums[i+1];
        //     }
        // }
        // return mini;

        // int start = 0;
        // int end = start+1;
        // int element = 0;
        // for(int i = start; i<nums.length; i++){
        //     if (nums[start] == key) {
        //         element = nums[end];
        //         return element;    
        //     }
        //     start++;
        // }
        // return element;

        int frequency = 0;
        if (nums.length == 1) {
            return 0;
        }

        if(nums.length == 2){
            if (nums[frequency] == key) {
                return nums[1];
            }
            else{
                return nums[frequency];
            }
        }

        if (nums.length == 3) {
            if (nums[frequency] == key) {
                return nums[frequency + 1];
            }
            else if (nums[frequency + 1] == key){
                return nums[frequency + 2];
            }
            else{
                return 0;
            }
        }
        
        for(int i = 0; i<nums.length-2; i++){
            if (nums[i] == key) {
                for(int j = i+2;j<nums.length; j++){
                    if (nums[i+1] == nums[j]) {
                        // frequency++;
                        // return nums[i+1];
                        frequency = nums[j];
                        // return frequency;
                        // System.out.println(nums[i+1]);
                    }
                    // else{
                    //     // System.out.println(nums[j]);
                    //     return nums[j];
                    // }
                }
            }
        }
        return frequency;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1000, 2};
        int key = 1000;

        System.out.println(Check_mostfreqnum(nums, key));
    }
}
