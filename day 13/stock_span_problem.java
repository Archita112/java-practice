import java.util.*;

public class stock_span_problem {
    public static void Span(int stocks[], int span[]){
        Stack<Integer> sh = new Stack<>();

        span[0] = 1;
        sh.push(0);

        // span[span.length-1] = span.length;
        for(int i = 1; i < stocks.length; i++){
            int currPrice = stocks[i];
            while(!sh.isEmpty() && currPrice > stocks[sh.peek()]){
                sh.pop();
            }

            if (sh.isEmpty()) {
                span[i] = i+1;
            } else {
                int previdx = sh.peek();
                span[i] = i - previdx;
            }

            sh.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        Span(stocks, span);

        for(int i = 0; i<span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}
