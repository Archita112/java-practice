// import java.util.ArrayList;
//2 pointer approach in arrays

public class container_wmaxw2 {
    public static int maxwater(int height[]){
        int maxWater = 0;
        int lp = 0;
        int n = height.length;
        int rp = n-1;
        while(lp < rp){
            int ht = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int area = ht * width;
            maxWater = Math.max(maxWater, area);
            if (height[lp] < height[rp]) {
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
        // ArrayList<Integer> waterbars = new ArrayList<>();
        // waterbars.add(1);
        // waterbars.add(8);
        // waterbars.add(6);
        // waterbars.add(2);
        // waterbars.add(5);
        // waterbars.add(4);
        // waterbars.add(8);
        // waterbars.add(3);
        // waterbars.add(7);
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxwater(height));
    }
}
