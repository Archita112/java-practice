import java.util.LinkedList;
import java.util.*;

public class interleave_fhalf_w_shalf{
    public static ArrayList<Integer> Interleaving(int N, Queue<Integer> q){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> sh = new Stack<>();

        for(int i = 1; i <= N / 2; i++){
            sh.push(q.remove()); //from this loop, the values in stack would be 4, 3, 2, 1
        }

        while(sh.size() > 0){
            q.add(sh.pop()); //after this, the queue would be 5, 6, 7, 8, 4, 3, 2, 1
        }

        for(int i = 1; i <= N / 2; i++){
            sh.push(q.remove()); //from this loop, the values in stack would be 8, 7, 6, 5
        }

        for(int i = 1; i <= N / 2; i++){
            q.add(sh.pop());
            q.add(q.remove());
        }

        while(q.size() > 0){
            sh.push(q.remove());
        }

        while(sh.size() > 0){
            q.add(sh.pop());
        }

        while(!q.isEmpty()){
            res.add(q.remove());
        }
        // for(int i = 0; i < res.size(); i++){
        //     System.out.print(res.get(i) + " ");
        // }
        return res;
        
    }
    public static void main(String[] args) {
        int N = 8;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        Interleaving(N, q);
    }
}