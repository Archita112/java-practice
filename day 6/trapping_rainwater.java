public class trapping_rainwater {
    public static int trapped_water(int height[]){
        // for(int i = 0; i < height.length; i++){
        //     // int left_max = Math.max(arr[i], arr[])
        //     int left_max = 0;
        //     for(int j = i; j >= 0; j--){
        //         left_max = Math.max(height[i], height[j]);
        //     }

        //     int right_max = 0;
        //     for(int k = i+1; k < height.length; k++){
        //         right_max = Math.max(height[i], height[k]);
        //     }

        //     int wl = Math.min(left_max, right_max);
        //     int water_tr = wl - height[i];
        //     return water_tr;
        // }

        int leftarr[] = new int[height.length];
        leftarr[0] = height[0];
        for(int i = 1; i<height.length; i++){
            leftarr[i] = Math.max(height[i], leftarr[i-1]);
        }

        int rightarr[] = new int[height.length];
        rightarr[height.length - 1] = height[height.length-1];
        for(int j = height.length - 2; j >=0; j--){
            rightarr[j] = Math.max(height[j], rightarr[j+1]);
        }

        int sum = 0;
        for(int k = 0; k< height.length; k++){
            int wl = Math.min(leftarr[k], rightarr[k]);
            int water_tr = wl - height[k];
            sum = sum + water_tr;
            // System.out.println("the water trapped is - " + water_tr);
            // System.out.println(sum);
            // System.out.println();
        }
        return sum;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapped_water(height));
    }
}
