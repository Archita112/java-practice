import java.util.Scanner;

public class lines_intersecting {
    public static void intersection(int a, int b, int c, int d){
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt(); // Read the number of test cases
        
        // Process each test case
        for (int i = 0; i < testCases; i++) {
            int a = scanner.nextInt(); // Read the first number
            int b = scanner.nextInt(); 
            int c = scanner.nextInt();
            int d = scanner.nextInt();// Read the second number
            intersection(a, b, c, d); // Process the current test case
        }
        scanner.close();
    }
}
