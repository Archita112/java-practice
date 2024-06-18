import java.util.Stack;

public class duplicate_parentheses {
    public static boolean Checkduplicatep(String news){
        Stack<Character> sh = new Stack<>();
        
        for(int i = 0; i < news.length(); i++){

            if (news.charAt(i) == ')') {
                int count = 0;
                while (sh.peek() != '(') {
                    sh.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    sh.pop();
                }
            } else {
                sh.push(news.charAt(i));
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String news = "((a+b))";
        String newt = "(a+b)";
        System.out.println(Checkduplicatep(news));
        System.out.println(Checkduplicatep(newt));
    }
}
