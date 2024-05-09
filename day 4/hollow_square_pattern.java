// package day 4;

//hollow square pattern means
// * * * * *
// *       *
// *       *
// * * * * *

import java.util.Scanner;

public class hollow_square_pattern {
    public static void hollow_pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");   
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();
        hollow_pattern(n);
        sc.close();
    }
}
