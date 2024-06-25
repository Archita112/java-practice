import java.util.LinkedList;
import java.util.Queue;

public class decimal_to_binary {
    public static Queue<String> Conversiondtb(int N){
        Queue<String> q = new LinkedList<>();

        for(int i = 0; i < N ; i++){
            q.add(Integer.toBinaryString(i));
        }

        while(q.size() != 0){
            System.out.print(q.remove() + " ");
        }
        return q;
    }
    public static void main(String[] args) {
        int N = 10;
        Conversiondtb(N);
    }
}
