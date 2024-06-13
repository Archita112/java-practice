// package day 12;

import java.util.ArrayList;

public class stack_arraylist {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data); //data added on top of stack
        }

        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() -1);
            return top;
        }

        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }
    }
}
