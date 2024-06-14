import java.util.Stack;

public class next_greater_element {
    public static int[] NextgreaterElement(int arr[]){
        int newarr[] = new int[arr.length];
        Stack<Integer> sh = new Stack<>();

        for(int i = arr.length-1; i >= 0; i--){
            while (!sh.isEmpty() && arr[sh.peek()] <= arr[i]) {
                sh.pop();
            }

            if (sh.isEmpty()) {
                newarr[i] = -1;
            } else {
                newarr[i] = arr[sh.peek()];
            }
            sh.push(i);
        }

        for(int i = 0; i < newarr.length; i++){
            System.out.print(newarr[i] + " ");
        }
        return newarr;
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        NextgreaterElement(arr);
    }
}
