import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        //sum of all even numbers till n using two approach - for loop, while loop

        //using for loop with if
        // for(int i = 0; i<=n; i++){
        //     if (i%2 == 0) {
        //         sum = sum + i;
        //     }
        // }

        //using while loop with if
        while(i <= n){
            if (i%2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
