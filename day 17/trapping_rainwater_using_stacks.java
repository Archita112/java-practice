import java.util.Stack;

public class trapping_rainwater_using_stacks {
    public static int trapped_water(int height[]){
        Stack<Integer> wtr = new Stack<>();
        int ans = 0;

        for(int i = 0; i < height.length; i++){
            // while(!wtr.isEmpty() && height[i] > height[wtr.peek()]){
            //     int top = wtr.pop();
            //     int distance = i - wtr.peek() - 1;
            //     int bounded_height = Math.min(height[i] - height[wtr.peek()], height[top]);
            //     ans += bounded_height * distance;
            // }
            // if (wtr.isEmpty()) {
            //     wtr.push(i);
            // }

            while(!wtr.isEmpty() && height[i] > height[wtr.peek()]){
                int top = wtr.pop();
                if(wtr.isEmpty()) {
                    break;
                }
                int distance = i - wtr.peek() - 1;
                int bounded_height = Math.min(height[i], height[wtr.peek()]) - height[top];
                ans += bounded_height * distance;
            }
            wtr.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int height[] = {9, 1, 4, 0, 2, 8, 6, 3, 5};
        System.out.println(trapped_water(height));
    }
}
