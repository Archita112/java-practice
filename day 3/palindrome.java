import java.util.Scanner;

public class palindrome {
    public static boolean check_palindrome(long n){
        // for(int i = 0; i<=n; i++){
        //     if (i ) {
                
        //     }
        // }
        long number = n;
        long reverse = 0;
        
        while(n > 0){
            long lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n /10;
        }
        return number == reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (check_palindrome(n)) {
            System.out.println("Number is palindrome.");
        }
        else{
            System.out.println("Number not palindrome.");
        }
        sc.close();
    }
}
