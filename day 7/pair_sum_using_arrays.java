// import java.util.ArrayList;

public class pair_sum_using_arrays {
    public static int Sumofpairs(int arr[], int k){
        int sum = 0;
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == k) {
                    // System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    sum = sum + 1;
                }
            }
        }
        // System.out.println("sum is - " +sum);
        return sum;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> waterbars = new ArrayList<>();
        // waterbars.add(1);
        // waterbars.add(2);
        // waterbars.add(3);
        // waterbars.add(4);
        // waterbars.add(5);
        // waterbars.add(6);

        int arr[] = {1, 2, 3, 4, 5, 6};

        int k = 5;
        System.out.println(Sumofpairs(arr, k));

    }
}
