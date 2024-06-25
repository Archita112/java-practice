import java.util.*;

public class dota2_senate{
    public static String Senator(String senate){
        Queue<Integer> rq = new LinkedList<>();
        Queue<Integer> dq = new LinkedList<>();

        //travering over string and adding positions of senators to their respective queues.
        for(int i = 0; i < senate.length(); i++){
            if (senate.charAt(i) == 'R') {
                rq.add(i);
            } else {
                dq.add(i);
            }
        }

        int n = senate.length();
        //comparison
        while(!rq.isEmpty() && !dq.isEmpty()) {
            int rIndex = rq.poll();
            int dIndex = dq.poll();
            if (rIndex < dIndex) {
                rq.add(rIndex + n);
            } else {
                dq.add(dIndex + n);
            }
        }

        if (dq.isEmpty()) return "Radiant";
        else return "Dire";
    }
    public static void main(String[] args) {
        String senate = "RDD";
        System.out.println(Senator(senate));
    }
}