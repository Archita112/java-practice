import java.util.*;

public class print_increasing {
    public static void print(int n){
        if (n == 0) return;
        System.out.print(n + " ");
        print(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n - ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
