//hard category
import java.util.Stack;

public class max_area_histogram {
    public static int Maxarea(int heights[]){
        int maxarea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        Stack<Integer> sh = new Stack<>();

        for(int i = heights.length - 1; i >= 0; i--){
            while(!sh.isEmpty() && heights[sh.peek()] >= heights[i]){
                sh.pop();
            }
            if (sh.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = sh.peek();
            }
            sh.push(i);
        }

        sh = new Stack<>();

        for(int i = 0; i < heights.length; i++){
            while(!sh.isEmpty() && heights[sh.peek()] >= heights[i]){
                sh.pop();
            }
            if (sh.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = sh.peek();
            }
            sh.push(i);
        }

        //width = j-i-1;
        for(int i = 0; i<heights.length; i++){
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currarea = height * width;
            maxarea = Math.max(currarea, maxarea);
        }

        return maxarea;
    }
    public static void main(String[] args) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        System.out.println(Maxarea(heights));
    }
}
