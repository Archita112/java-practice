//bruteforce method using arraylist

import java.util.ArrayList;

public class container_wmaxw {
    public static void maxwater(ArrayList<Integer> waterbars){
        int minwater = Integer.MIN_VALUE;
        // int width = 1;

        for(int i = 0; i<waterbars.size()-1; i++){
            for(int j = i+1;j<waterbars.size(); j++){
                int height = Math.min(waterbars.get(i), waterbars.get(j));
                int width = j - i;
                int area = height * width;
                if (area > minwater) {
                    minwater = area;
                }
            }
            // width++;
        }
        System.out.println(minwater);

    }
    public static void main(String[] args) {
        ArrayList<Integer> waterbars = new ArrayList<>();
        waterbars.add(1);
        waterbars.add(8);
        waterbars.add(6);
        waterbars.add(2);
        waterbars.add(5);
        waterbars.add(4);
        waterbars.add(8);
        waterbars.add(3);
        waterbars.add(7);

        maxwater(waterbars);
    }
}
