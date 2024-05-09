import java.util.Scanner;

public class another {

    public static String compactString(String word) {
        int n = word.length();
        if (n > 10) {
            StringBuilder abbreviation = new StringBuilder();
            abbreviation.append(word.charAt(0));
            abbreviation.append(n - 2);
            abbreviation.append(word.charAt(n - 1));
            return abbreviation.toString();
        } else {
            return word;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.next();
        System.out.println("Abbreviated word:");
        System.out.println(compactString(word));
        sc.close();
    }
}
