// package day 4;

import java.util.Scanner;

public class dec_2_bin {
    public static int dconver(int n){
        int power = 0;
        int bin = 0;
        while(n > 0){
            int rem = n % 2;
            int q = n / 2;
            bin = bin + (rem * (int)Math.pow(10, power));
            power ++;

            n = q;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dconver(n));
        sc.close();
    }
}
