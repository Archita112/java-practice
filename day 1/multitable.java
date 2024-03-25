import java.util.Scanner;

public class multitable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        //multiplication table till n number
        
        // for(int i = 0; i < 13; i++){
        //     System.out.println(n + " X "+ i + " = "+ (n*i));
        // }

        //multiplication table till n number in reverse order
        for(int i = 12; i>=1; i--){
            System.out.println(n + " X "+ i + " = "+ (n*i));
        }
        
        sc.close();
    }
}
