public class sliding_window_maximum {
    public static int[] Slidingwindow(int nums[], int k) {
        int result[] = new int[nums.length - k + 1];
        int N = nums.length;

        for (int i = 0; i <= N-k; i++) {
            int min = Integer.MIN_VALUE;
            for(int j = i; j <= i+k-1; j++){
                min = Math.max(min, nums[j]);
                result[i] = min;
            }
        }
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1, -1};
        int k = 1;
        Slidingwindow(nums, k);
    }
}
