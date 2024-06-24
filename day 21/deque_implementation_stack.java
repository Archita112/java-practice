import java.util.LinkedList;
import java.util.*;

public class deque_implementation_stack {
    static class stack{
        Deque<Integer> deque = new LinkedList<>();

        public void Push(int data){
            deque.addLast(data);
        }

        public int Pop(){
            return deque.removeLast();
        }

        public int Peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        stack sh = new stack();
        sh.Push(1);
        sh.Push(2);
        sh.Push(3);

        // System.out.println(sh.Peek());
        System.out.println(sh.Pop());
        System.out.println(sh.Pop());
        System.out.println(sh.Pop());
    }
}
