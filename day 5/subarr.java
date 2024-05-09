public class subarr {
    public static int subarrays(int nums[]){
        int n = nums.length;
        // int mins, maxs;
        for(int i = 0; i<n; i++){
            // mins = i;
            for(int j = i; j<n; j++){
                for(int k = i; k <= j; k++){
                    System.out.print( nums[k] + " ");
                }
                int mins = nums[i];
                System.out.println();
                System.out.println("Minimum sum is " + mins);

                int maxs = 0;
                for(int l = i; l<=j; l++){
                    maxs += nums[l];
                    // return maxs;
                }
                System.out.println("Maximum sum is " + maxs);
                System.out.println();
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        subarrays(nums);
    }
}
