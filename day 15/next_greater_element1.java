public class next_greater_element1 {
    public static int[] nextgreaterelement(int nums1[], int nums2[]){
        int newarr[] = new int[nums1.length];
        //bcuz nums1 is subset of nums2
        boolean found = false;
        for(int i = 0; i < nums1.length; i++){
            found = false;
            for(int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j]) {
                    found = true;
                }
                if (found && nums2[j] > nums1[i]) {
                    newarr[i] = nums2[j];
                    break;
                }
            }
        }
        for(int i = 0; i<newarr.length; i++){
            if (newarr[i] == 0) {
                newarr[i] = -1;
            }
        }

        for(int i = 0; i<newarr.length; i++){
            System.out.print(newarr[i] + " ");
        }
        return newarr;
    }
    public static void main(String[] args) {
        int nums1[] = {4, 1, 2};
        int nums2[] = {1, 3, 4, 2};
        nextgreaterelement(nums1, nums2);
    }
}
