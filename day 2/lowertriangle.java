import java.util.Scanner;

public class lowertriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
