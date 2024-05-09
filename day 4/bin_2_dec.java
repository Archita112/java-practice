// package day 4;

import java.util.Scanner;

public class bin_2_dec {
    public static long bconver(long n){
        long power = 0;
        long deci = 0;
        while(n>0){
            long ld = n % 10;
            deci = deci + (ld * (long)Math.pow(2, power));
            power++;

            n = n/10;
        }
        return deci;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(bconver(n));
        sc.close();
    }
}
