import java.util.Stack;

public class valid_parenthesis {
    public static boolean ValidParentheses(String s){
        Stack<Character> sh = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if ((s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{')) {
                sh.push(s.charAt(i));
            } else {
                if (sh.isEmpty()) {
                    return false;
                }

                if ((sh.peek() == '(' && s.charAt(i) == ')') || (sh.peek() == '[' && s.charAt(i) == ']') || (sh.peek() == '{' && s.charAt(i) == '}')) {
                    sh.pop();
                } else {
                    return false;
                }
            }
        }

        if (sh.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "({})[]";
        System.out.println(ValidParentheses(s));
    }
}
