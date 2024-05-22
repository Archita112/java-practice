// package day 8;

import java.util.ArrayList;
import java.util.Arrays;

public class union_of_arrs {
    public static int Union(int a[], int b[]){
        // int maxl = Math.max(a.length, b.length);

        // Arrays.sort(a);
        // Arrays.sort(b);

        // ArrayList<Integer> list = new ArrayList<>();

        // if(a.length > b.length){
        //     for(int i = 0; i<a.length; i++){
        //         list.add(i);
        //     }
    
        //     for(int i = 0; i<b.length; i++){
        //         if (list.get(i) != b[i]) {
        //             list.add(b[i]);
        //         }
        //     }
        // }
        
        // if (a.length < b.length) {
        //     for(int i = 0; i<b.length; i++){
        //         list.add(i);
        //     }
    
        //     for(int i = 0; i<a.length; i++){
        //         if (list.get(i) != a[i]) {
        //             list.add(a[i]);
        //         }
        //     }

        // if (a.length >= b.length) {
        //     for(int i = 0; i<a.length; i++){
        //         list.add(i);
        //         for(int j = 0; j<b.length; j++){
        //             if (a[i] != b[j]) {
        //                 list.add(j);
        //             }
        //         }
        //     }
        // }

        // else if (b.length > a.length) {
        //     for(int i = 0; i<b.length; i++){
        //         list.add(i);
        //         for(int j = 0; j<a.length; j++){
        //             if (b[i] != a[j]) {
        //                 list.add(j);
        //             }
        //         }
        //     }
        // }
        // return list.size();

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                list.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                list.add(b[j]);
                j++;
            } else {
                list.add(i);
                i++;
                j++;
            }
        }

        while (i < a.length) {
            list.add(a[i]);
            i++;
        }

        while (j < b.length) {
            list.add(b[j]);
            j++;
        }
        return list.size();
    }

    // public static int[] Intersection(int a[], int b[]){

    // }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3};
        System.out.println(Union(a, b));
    }
}
