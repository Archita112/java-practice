//solved using arraylists

import java.util.ArrayList;

public class pair_sum {
    public static int Sumofpairs(ArrayList<Integer> waterbars, int k){
        int sum = 0;
        for(int i = 0; i<waterbars.size()-1; i++){
            for(int j = i+1; j<waterbars.size(); j++){
                if (waterbars.get(i) + waterbars.get(j) == k) {
                    System.out.println("(" + waterbars.get(i) + ", " + waterbars.get(j) + ")");
                    sum = sum + 1;
                }
            }
        }
        System.out.println("sum is - " +sum);
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> waterbars = new ArrayList<>();
        waterbars.add(1);
        waterbars.add(2);
        waterbars.add(3);
        waterbars.add(4);
        waterbars.add(5);
        waterbars.add(6);

        int k = 5;
        Sumofpairs(waterbars, k);

    }
}
