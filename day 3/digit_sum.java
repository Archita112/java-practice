import java.util.Scanner;

public class digit_sum {
    public static long sum_digits(long n){
        long sum = 0;
        while(n > 0){
            // long lastdigit = n % 10;
            long lastdigit = n % 10;
            sum += lastdigit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = sum_digits(n);
        System.out.println(ans);
        sc.close();
    }
}
