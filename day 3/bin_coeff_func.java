// package day 3;
import java.util.Scanner;

public class bin_coeff_func {
    public static int fac_num(int n){
        int fac_ans = 1;
        for(int i = 1; i <=n ; i++){
            fac_ans = fac_ans * i;
        }
        return fac_ans;
    }
    public static int bin_coeff(int n, int r){
        int n_fac = fac_num(n);
        int r_fac = fac_num(r);
        int nmr_fac = fac_num(n-r);

        int o_fac = (n_fac/(r_fac*nmr_fac));
        System.out.println(o_fac);
        return o_fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        bin_coeff(n, r);
        sc.close();
        // int new_ans = fac_num(n);
    }
}
