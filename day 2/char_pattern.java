// package day 2;
import java.util.Scanner;

public class char_pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        char j = 'A';
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int z = 1; z <= count; z++){
                System.out.print(j + " ");
                j++;
            }
            System.out.print("\n");
            count++;
        }
        sc.close();
    }
}
