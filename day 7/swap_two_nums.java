import java.util.ArrayList;

public class swap_two_nums {
    public static void swapping(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        // for(int i = 0; i<list.size(); i++){
            // if (list.get(i) == list.get(idx1)) {
                // list.get(idx1) = list.get(idx2);
                // list.get(idx2) = temp;
            // }
        // }
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1, idx2 = 3;
        swapping(list, idx1, idx2);

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
