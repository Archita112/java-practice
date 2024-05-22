// package day 8;

// import java.util.ArrayList;
import java.util.HashSet;
// import java.util.Set;

public class intersection_of_arrs {
    public static void Intersection(int nums1[], int nums2[]){
        HashSet<Integer> hm = new HashSet<>();
        int i = 0, j = 0;
        // int a = nums1.length;
        // int b = nums2.length;

        while(i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]) {
                hm.add(j);
                j++;
            }
            // else { j++; }
            i++;
            // j++;
        }
        // int k = hm.size();
        // System.out.println(k);

        // int[] array = convertHashSetToArray(hm);
        // for (int i : array) {
        //     System.out.println(i);
        // }

        // int arr[];
        // for(int k = 0; k<hm.size(); k++){
        //     arr[i] = hm.
        // }
        // return hm.toArray(new Integer[0]);
    }
    // public static ArrayList<Integer> Intersection1(int nums1[], int nums2[]){
    //     //bruteforce
    //     // Arraylist<Integer> list = new ArrayList<>();
    //     Arraylist<Integer> list = new 

    //     for(int i = 0; i<nums1.length; i++){
    //         for(int j = 0; j<nums2.length; j++){
    //             if (nums1[i] == nums2[j]) {
                    
    //             }
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        Intersection(nums1, nums2);
    }
}
