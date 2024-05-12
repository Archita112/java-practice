import java.util.ArrayList;

public class muldim_arrl {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(10);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(6);
        list2.add(9);
        list2.add(12);
        list2.add(15);

        mainlist.add(list);
        mainlist.add(list1);
        mainlist.add(list2);

        System.out.println(mainlist);
    }
}
