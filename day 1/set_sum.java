import java.util.Scanner;

public class set_sum {
    public static void main(String[] args) {
        int n; int j;
        int even_sum = 0;
        int odd_sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i<= n; i++){
            j = sc.nextInt();
            if (j%2 == 0) {
                even_sum += j;
            }
            else{
                odd_sum += j;
            }
        }
        System.out.println("Even sum - "+ even_sum);
        System.out.println("Odd sum - " + odd_sum);
        sc.close();
    }
}
