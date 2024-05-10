import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;
//complexity - O(n^3)
//doesn't remove duplicates

public class threesum {
    public static List<List<Integer>> threeSum(int nums[]){
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // System.out.println("[" + nums[i] + "," + nums[j] + "," + nums[k] + "]");
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        result.add(triplet);
                    }
                    // System.out.println();
                }
            }
            // System.out.println();
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, 4};
        System.out.println(threeSum(nums));
    }
}
