import java.util.Stack;

public class min_stack {
    static class MinStack{
        Stack<Integer> sh = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        public MinStack(){
        
        }

        public void push(int val){
            sh.push(val);
            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop(){
            if (!sh.isEmpty()) {
                int poppedValue = sh.pop();
                if (poppedValue == minStack.peek()) {
                    minStack.pop();
                }
            }
        }

        public int top(){
            if (!sh.isEmpty()) {
                return sh.peek();
            }
            else {
                return -1;
            }
        }

        public int getMin(){
            if (!minStack.isEmpty()) {
                return minStack.peek();
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);

        System.out.println("Min: " + ms.getMin()); // Output should be 1

        ms.pop();
        System.out.println("Top: " + ms.top());   // Output should be 2
        System.out.println("Min: " + ms.getMin()); // Output should be 1

        ms.pop();
        System.out.println("Top: " + ms.top());   // Output should be 1
        System.out.println("Min: " + ms.getMin()); // Output should be 1

        ms.pop();
        System.out.println("Min: " + ms.getMin());
    }
}
