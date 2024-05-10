public class buyandsell_stocks {
    public static int profit_price(int prices[]){
        //left min - buying price
        // int bp = 0;
        // for(int i = 1; i < prices.length; i++){
        //     bp = Math.min(prices[i], prices[i-1]);
        //     int sp = prices[i] - bp;
        //     int profit = sp-bp;
        // }

        int bpp = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i< prices.length; i++){
            if( bpp < prices[i]){
                // bpp = prices[i];
                // int sp = prices[i];
                int bprofit = prices[i] - bpp;
                profit = Math.max(profit, bprofit);
            }
            else{
                bpp = prices[i];
                int bprofit = prices[i] - bpp;
                profit = Math.max(profit, bprofit);
            }
            // profit = Math.max(profit,);
            // System.out.println(profit);
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(profit_price(prices));
    }
}
