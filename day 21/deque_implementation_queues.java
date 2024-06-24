import java.util.LinkedList;
import java.util.*;

public class deque_implementation_queues {
    static class queue{
        Deque<Integer> deque = new LinkedList<>();
        public void Add(int data){
            deque.addLast(data);
        }

        public int Remove(){
            return deque.removeFirst();
        }

        public int Peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.Add(1);
        q.Add(2);
        q.Add(3);

        // System.out.println(q.Peek());
        System.out.println(q.Remove());
        System.out.println(q.Remove());
        System.out.println(q.Remove());
    }
}
