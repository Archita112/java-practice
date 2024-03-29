// package day 3;

import java.util.Scanner;

public class fac_func {

    public static int fac_num(int n){
        int fac_ans = 1;
        for(int i = 1; i <=n ; i++){
            fac_ans = fac_ans * i;
        }
        return fac_ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int new_ans = fac_num(n);
        System.out.println(new_ans);
        sc.close();
    }
}
