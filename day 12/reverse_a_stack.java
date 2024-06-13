// package day 12;

import java.util.Stack;

public class reverse_a_stack {
    public static void pushatBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatBottom(s, data);
        s.push(top);
    }
    public static void ReverseaStack(Stack<Integer> sh){
        if (sh.isEmpty()) {
            return;
        }
        int top = sh.pop();
        ReverseaStack(sh);
        pushatBottom(sh, top);
    }
    public static void main(String[] args) {
        Stack<Integer> sh = new Stack<>();
        sh.push(1);
        sh.push(2);
        sh.push(3);

        ReverseaStack(sh);
        while(!sh.isEmpty()){
            System.out.print(sh.pop() + " ");
        }
    }
}
