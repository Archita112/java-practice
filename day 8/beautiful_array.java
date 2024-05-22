// package day 8;

import java.util.ArrayList;

public class beautiful_array {
    public static int[] Forming_beautiful_arr(int n){
        // int newarr[] = new int[n];
        // int nums[] = {1};
        
        // if (n == 2) {
            //     if(n%2 == 0){
                //         int odd_ele = 2*nums[0] + 1;
                //         if (odd_ele <= n) {
                    //             list.add(odd_ele);
                    //         }
                    //     }
                    //     else {
                        //         int even_ele = 2*nums[0];
                        //         if (even_ele <= n) {
                            //             list.add(even_ele);
                            //         }
                            //     }
                            // }
                            
                            // if(n == 1){
                                //     list.add(1);
                                // }

        // for(int i = 1; i<n; i++){
        //     if(i%2 == 0){
        //         int odd_ele = 2*list.get(0) + 1;
        //         if (odd_ele <= n) {
        //             list.add(odd_ele);
        //         }
        //     }
        //     else {
        //         int even_ele = 2*list.get(0);
        //         if (even_ele <= n) {
        //             list.add(even_ele);
        //         }
        //     }
        // }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        while(list.size() < n){
            ArrayList<Integer> new_list = new ArrayList<>();
            for (int element : list) {
                if (2*element - 1 <= n) {
                    new_list.add(element*2 - 1);
                }
            }
            for (int element : list) {
                if (2*element <= n) {
                    new_list.add(element * 2);
                }
            }
            list = new_list;
        }

        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            res[i] = list.get(i);
        }

        // Object narr = list.toArray();
        return res;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Forming_beautiful_arr(n));
        // Forming_beautiful_arr(n);
    }
}
