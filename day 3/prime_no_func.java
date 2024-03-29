// package day 3;

import java.util.Scanner;

public class prime_no_func {
    public static boolean prime_num(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (prime_num(n)) {
            System.out.println("The number is prime.");
        }
        else{
            System.out.println("The number is not prime.");
        }
        sc.close();
    }
}
