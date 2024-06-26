public class minimum_ops {
    public static int Minimum(int nums[]){
        int count = 0;
        
        for(int i = 0; i < nums.length - 2; i++){
            int j = i + 1;
            int k = j + 1;

            if (nums[i] == 0 && k < nums.length) {
                nums[i] = 1;
                if (nums[j] == 0) {
                    nums[j] = 1;
                } else {
                    nums[j] = 0;
                }

                if (nums[k] == 0) {
                    nums[k] = 1;
                } else {
                    nums[k] = 0;
                }

                count++;
            }
        }

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        if (sum == nums.length) return count;
        else return -1;
    }
    public static void main(String[] args) {
        int nums[] = {0, 1, 1, 1, 0, 0};
        System.out.println(Minimum(nums));
    }
}
