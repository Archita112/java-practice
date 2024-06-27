import java.util.Stack;

public class visibility_of_a_queue{
    public static int[] canSeePersonsCount(int[] heights){
        Stack<Integer> sh = new Stack<>();
        int res[] = new int[heights.length];

        for(int i = 0; i < heights.length; i++){
            while (!sh.isEmpty() && heights[sh.peek()] <= heights[i]) {
                res[sh.peek()]++;
                sh.pop();
            }

            if (!sh.isEmpty()) {
                res[sh.peek()]++;
            }
            sh.push(i);
        }

        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
        return res;
    }
    public static void main(String[] args) {
        int heights[] = {10, 6, 8, 5, 11, 9};
        canSeePersonsCount(heights);
    }
}