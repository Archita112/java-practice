//prefix method

public class max_subarr_sum2 {
    public static int prefix_arr(int nums[]){
        int n = nums.length;
        int prefixarr[] = new int[n];
        int currs = 0;
        for(int j = 0; j<n; j++){
            currs += nums[j];
            prefixarr[j] = currs;
            // System.out.println(prefixarr[j]);
        }
        for(int k = 0; k<n; k++){
            System.out.print(prefixarr[k] + " ");
        }

        System.out.println();
        int start = 2;
        int end = 4;
        int arrsum = start == 0 ? prefixarr[end] : prefixarr[end] - prefixarr[start-1];
        System.out.println("array sum for this sub array is " + arrsum);

        return arrsum;
        // return prefixarr;
    }
    // public static int max_sum(int nums[], int prefixarr[]){
    //     prefix_arr(nums);
    //     int start = 1;
    //     int end = 3;
    //     int arrsum = prefixarr[end] - prefixarr[start-1];
    //     System.out.println(arrsum);
    //     return arrsum;
    // }
    public static void main(String[] args) {
        int nums[] = {1, -2, 6, -1, 3};
        // int prefixarr[] = prefix_arr(nums);
        prefix_arr(nums);
        // max_sum(nums, prefixarr);
    }
}