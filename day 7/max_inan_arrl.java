import java.util.ArrayList;

public class max_inan_arrl {
    public static int maximum_number(ArrayList<Integer> list){
        int minimum = Integer.MIN_VALUE;
        for(int i = 0; i<list.size(); i++){
            if (list.get(i) > minimum) {
                minimum = list.get(i);
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(maximum_number(list));
    }
}
