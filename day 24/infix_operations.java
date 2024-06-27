import java.util.Stack;

public class infix_operations {
    public static int performingInfixoperations(String s){
        Stack<Integer> num = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 47 && ascii <= 57) {
                num.push(ascii - 48);
            } else if (ops.size() == 0) {
                ops.push(ch);
            } else {
                if (ch == '+' || ch == '-') {
                    int v2 = num.pop();
                    int v1 = num.pop();
                    if (ops.peek() == '-') num.push(v1-v2);
                    if (ops.peek() == '+') num.push(v1+v2);
                    if (ops.peek() == '*') num.push(v1*v2);
                    if (ops.peek() == '/') num.push(v1/v2);
                    ops.pop();
                    ops.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (ops.peek() == '*' || ops.peek() == '/') {
                        int v2 = num.pop();
                        int v1 = num.pop();
                        if (ops.peek() == '*') num.push(v1*v2);
                        if (ops.peek() == '/') num.push(v1/v2);
                        ops.pop();
                        ops.push(ch); 
                    } else {
                        ops.push(ch);
                    }
                }
            }
        }

        while(num.size() > 1){
            int v2 = num.pop();
            int v1 = num.pop();
            if (ops.peek() == '-') num.push(v1-v2);
            if (ops.peek() == '+') num.push(v1+v2);
            if (ops.peek() == '*') num.push(v1*v2);
            if (ops.peek() == '/') num.push(v1/v2);
            ops.pop();
        }

        return num.peek();
    }
    public static void main(String[] args) {
        String s = "9-5+3*4/6";
        System.out.println(performingInfixoperations(s));
    }
}
