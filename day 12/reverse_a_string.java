import java.util.Stack;

public class reverse_a_string {
    public static String Reverse(String str){
        int idx = 0;
        Stack<Character> ch = new Stack<>();
        while(idx < str.length()){
            ch.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!ch.isEmpty()) {
            char current = ch.pop();
            result.append(current);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String str = "hello";

        System.out.println(Reverse(str));
    }
}
