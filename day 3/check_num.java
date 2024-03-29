import java.util.Scanner;

public class check_num {
    public static int isEven(int n){
        if (n%2 == 0) {
            System.out.println("The integer is even.");
        }
        else {
            System.out.println("The integer is not even.");
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isEven(n);
        sc.close();
    }
}
