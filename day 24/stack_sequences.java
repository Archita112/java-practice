import java.util.Stack;

public class stack_sequences {
    public static boolean validateStackSequences(int[] pushed, int[] popped){
        Stack<Integer> shpu = new Stack<>();
        int j = 0;

        //push all the elements of pushed arr
        for(int i = 0; i < pushed.length; i++){
            shpu.push(pushed[i]);
            while(!shpu.isEmpty() && shpu.peek() == popped[j]){
                shpu.pop();
                j++;
                // break;
            }
        }

        // while(!shpu.isEmpty() && !shpo.isEmpty()){
        //     if (shpu.peek() == shpo.peek()) {
        //         shpu.pop();
        //         shpo.pop();
        //     }
        // }
        
        return shpu.isEmpty();
    }
    public static void main(String[] args) {
        int pushed[] = {1,2,3,4,5};
        int popped[] = {4,5,3,2,1};

        System.out.println(validateStackSequences(pushed, popped));
    }
}
