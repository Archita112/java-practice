import java.util.LinkedList;
import java.util.*;

public class reverse_firstk_elements{
    public static Queue<Integer> Reversing(Queue<Integer> q, int k){
        Stack<Integer> sh = new Stack<>();

        for(int i = 0; i < k; i++){
            sh.push(q.peek());
            q.remove();
        }

        while(!sh.isEmpty()){
            q.add(sh.pop());
        }

        for(int i = 0; i < q.size()-k; i++){
            int value = q.peek();
            q.remove();
            q.add(value);
        }

        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;

        System.out.println(Reversing(q, k));
    }
}