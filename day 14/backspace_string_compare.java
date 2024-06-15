import java.util.Arrays;
import java.util.Stack;

public class backspace_string_compare {
    public static boolean Backspace_comparison(String s, String t){
        Stack<String> sh = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '#') {
                if (!sh.isEmpty()) {
                    sh.pop();
                }
            } else {
                sh.push(String.valueOf(s.charAt(i)));
            }
        }

        String newarr[] = sh.toArray(new String[0]);
        // for(int i = 0; i<newarr.length; i++){
        //     System.out.print(newarr[i]);
        // }

        Stack<String> sh1 = new Stack<>();

        for(int i = 0; i < t.length(); i++){
            if (t.charAt(i) == '#') {
                if (!sh1.isEmpty()) {
                    sh1.pop();
                }
            } else {
                sh1.push(String.valueOf(t.charAt(i)));
            }
        }
        
        String newarr1[] = sh1.toArray(new String[0]);
        // for(int i = 0; i<newarr1.length; i++){
        //     System.out.print(newarr[i]);
        // }
        return Arrays.equals(newarr, newarr1);
    }
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        System.out.println(Backspace_comparison(s, t));
    }
}
