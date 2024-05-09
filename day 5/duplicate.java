import java.util.Arrays;

public class duplicate {
    public static boolean arr_duplicates(int nums[]){
        //solution 1
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if (nums[j] == nums[i]) {
        //             return true;
        //         }
        //     }
        // }

        //solution 2
        // int start = 0;
        // for(int i = start; i < nums.length; i++){
        //     int end = i + 1;
        //     while(end < nums.length){
        //         if (nums[end] == nums[start]) {
        //             return true;
        //         } end++;
        //     }
        //  start ++;   
        // }

        //solution 3
        // int start = 0;
        // for(int i = start; i< nums.length; i++){
        //     int end = nums.length-1;
        //     if(end > i){
        //         if (nums[end] == nums[i]) {
        //             return true;
        //         }
        //         end--;
        //         start++;
        //     }
        // }

        //solution 4
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {2, 3, 18, 22, 22};
        System.out.println(arr_duplicates(nums));
    }
}
