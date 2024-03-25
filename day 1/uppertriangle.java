import java.util.Scanner;

public class uppertriangle {
    public static void main(String[] args) {
        //we will print here star pattern

        //1. in for loop
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i = n; i > 0; i--){
        //     for(int j = 0; j < i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        //2. using while loop
        int i = n;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i--;
        }
        sc.close();
    }
}
