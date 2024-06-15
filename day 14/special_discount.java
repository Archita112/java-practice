import java.util.Stack;

public class special_discount {
    public static int[] Discount(int prices[]){
        int newarr[] = new int[prices.length];
        Stack<Integer> sh = new Stack<>();

        for(int i = 0; i < prices.length; i++){
            sh.push(prices[i]);
            if (i == prices.length - 1) {
                newarr[i] = prices[i];
            }
            for(int j = i+1; j < prices.length; j++){
                if (prices[j] <= prices[i]) {
                    newarr[i] = prices[i] - prices[j];
                    break;
                } else {
                    newarr[i] = prices[i];
                }
            }
        }

        // for(int i = 0; i<newarr.length; i++){
        //     System.out.print(newarr[i] + " ");
        // }

        return newarr;
    }
    public static void main(String[] args) {
        int prices[] = {10,1,1,6};
        Discount(prices);
    }
}
