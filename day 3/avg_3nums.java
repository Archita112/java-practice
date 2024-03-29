import java.util.Scanner;

public class avg_3nums {
    public static int avg_nums(int l, int m, int n){
        int sums = (l+m+n)/3;
        return sums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(avg_nums(l, m, n));
        sc.close();
    }
}
