import java.util.Arrays;
import java.util.Scanner;

public class different_string {
    public static void newstring(String sr){
        char charArray[] = sr.toCharArray();
        Arrays.sort(charArray);
        int n = charArray.length-1, f = 0;
        while (f < n) {
            char temp = charArray[n];
            charArray[n] = charArray[f];
            charArray[f] = temp;
            // temp = nums[n];
            f ++;
            n--;
        }

        String xyz = new String(charArray);
        if(sr.equals(xyz)){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
            System.out.println(xyz);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sr = sc.nextLine();
        newstring(sr.toLowerCase());
        sc.close();
    }
}
