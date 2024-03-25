import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n, fac = 1;
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        //factorial using for loop

        // for(int i = n; i >= 1; i--){
        //     fac = i * fac;
        // }

        //factorial using while loop

        int i = n;
        while(i >= 1){
            fac = i * fac;
            i--;
        }
        System.out.println(fac);
        num.close();
    }
}
