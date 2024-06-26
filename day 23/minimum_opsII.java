public class minimum_opsII {
    public static int MinimumOp(int nums[]){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 0) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
            count++;
        }

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        if (sum == nums.length) return count;
        else return 1;
    }
    public static void main(String[] args) {
        int nums[] = {0, 1, 1, 0, 1};
        System.out.println(MinimumOp(nums));
    }
}
