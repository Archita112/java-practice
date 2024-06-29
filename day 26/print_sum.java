import java.util.Scanner;

public class print_sum {
    public static void print_1n(long n, long sum){
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        print_1n(n-1, sum+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n - ");
        long n = sc.nextLong();
        print_1n(n, 0);
        sc.close();
    }
}
