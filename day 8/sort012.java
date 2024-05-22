// package day 8;
import java.util.*;

public class sort012 {
    public static void sorting012(int a[]){
        Arrays.sort(a);
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {0, 2, 1, 2, 0};
        sorting012(a);
    }
}
