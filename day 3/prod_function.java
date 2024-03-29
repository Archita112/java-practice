import java.util.Scanner;

public class prod_function {
    public static int product(int a, int b) {
        int prod = a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod_ans = product(a, b);
        System.out.println("The product is - " + prod_ans);
        sc.close();
    }
}
