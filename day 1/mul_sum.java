import java.util.Scanner;

public class mul_sum {
    public static void main(String[] args) {
        int i, j, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number for which you want to generate multiplication table of - ");
        n = sc.nextInt();

        System.out.println("Enter the number till which you want the table to be - ");
        j = sc.nextInt();

        for(i = 1; i <= j; i++){
            sum += n * i;
            // sum += sum;
        }
        System.out.println(sum);
        sc.close();
    }
}
