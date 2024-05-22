// package day 8;

import java.util.ArrayList;
import java.util.Arrays;

public class lonely_number {
    public static ArrayList<Integer> Checking_lonelynums(int nums[]){
        // Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        if(nums.length == 1){
            list.add(nums[0]);
            return list;
        }

        Arrays.sort(nums);
        if(nums[1] - nums[0] > 1){
            list.add(nums[0]);
        }

        for(int i = 1; i<nums.length - 1;i++){
            if(nums[i+1] - nums[i] > 1 && nums[i] - nums[i-1] > 1){
                list.add(nums[i]);
            }
        }

        if (nums[nums.length - 1] - nums[nums.length - 2] > 1) {
            list.add(nums[nums.length - 1]);
        }
        return list;
    }
    public static void main(String[] args) {
        int nums[] = {10, 6, 5, 8};
        System.out.println(Checking_lonelynums(nums));
    }
}
