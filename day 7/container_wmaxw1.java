//2 pointer approach in arraylists

import java.util.ArrayList;

public class container_wmaxw1 {
    public static int maxwater(ArrayList<Integer> waterbars){
        int maxWater = 0;
        int lp = 0;
        int n = waterbars.size();
        int rp = n-1;
        while(lp < rp){
            int height = Math.min(waterbars.get(lp), waterbars.get(rp));
            int width = rp - lp;
            int area = height * width;
            maxWater = Math.max(maxWater, area);
            if (waterbars.get(lp) < waterbars.get(rp)) {
                lp++;
            }
            else{
                rp--;
            }
            // System.out.println(area);
        }
        return maxWater;
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

        System.out.println(maxwater(waterbars));
    }
}
