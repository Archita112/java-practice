public class pair_sum_sorted_rotated_arr {
    public static int Sumofpairs_rotatedarr(int arr[], int sum){
        int bp = -1;
        int k = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if (arr[i] > arr[i+1]) {
                bp = i;
                return bp;
                // return i;
            }
        }
        int lp = bp + 1;
        int rp = bp;

        while(lp != rp){
            if(arr[lp] + arr[rp] == sum){
                k++;
            }
            else if(arr[lp] + arr[rp] < sum){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        if(k == 0) return -1;
        return k;
    }
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};

        int sum = 16;
        System.out.println(Sumofpairs_rotatedarr(arr, sum));
    }
}
