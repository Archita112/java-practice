// package day 8;

public class min_max_sum {
    public static int FindSum(int arr[]){
        int minv = Integer.MIN_VALUE;
        int maxv = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if (arr[i] > minv) {
                minv = Math.max(minv, arr[i]);
            }

            if (arr[i] < maxv) {
                maxv = Math.min(maxv, arr[i]);
            }
        }
        int sum = minv + maxv;
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {-2, 1, -4, 5, 3};
        System.out.println(FindSum(arr));
    }
}
