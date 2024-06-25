import java.util.*;

public class reveal_card_in_inc_order {
    public static int[] Cards(int deck[]){
        Queue<Integer> deq = new LinkedList<>();
        int res[] = new int[deck.length];

        //add all indexes of deck arr into queue
        for(int i = 0; i < deck.length; i++){
            deq.add(i);
        }

        Arrays.sort(deck);
        //traversing deq arr
        for(int i = 0; i < deck.length; i++){
             res[deq.poll()] = deck[i];
            if (!deq.isEmpty()) {
                deq.add(deq.poll());
            }
        }

        // for(int i = 0; i < res.length; i++){
        //     System.out.print(res[i] + " ");
        // }

        return res;
    }
    public static void main(String[] args) {
        int deck[] = {17,13,11,2,3,5,7};
        Cards(deck);
    }
}
