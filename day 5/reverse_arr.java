public class reverse_arr {
    public static int reverse(int nums[]){
        int n = nums.length-1, f = 0;
        // for(int i = 0; i < 5; i++){
        //     nums[n-1] = nums[i];
        //     n--;
        // }
        while (f < n) {
            int temp = nums[n];
            nums[n] = nums[f];
            nums[f] = temp;
            // temp = nums[n];
            f ++;
            n--;
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        reverse(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
