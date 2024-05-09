public class pairs_in_arr {
    public static int pairs(int nums[]){
        int fi = 0, li = fi + 1;
        int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     if (fi <= li && fi < n && li < n) {
        //         System.out.println("("+ nums[fi] +", "+ nums[li] +")");
        //         fi++;
        //         li++;
        //     }
        // }

        for(fi = 0; fi < n; fi++){
            for(li = fi + 1; li < n; li++){
                System.out.print("("+ nums[fi] +", "+ nums[li] +") ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        pairs(nums);
    }
}
