class SlidingWindow {
    public static void main(String[] args) {
        int[] price = {10, 1, 5, 6, 7, 1};

        int buy = price[0];   // Minimum price seen so far
        int sell = 0;         // Current selling price
        int best = 0;         // Maximum profit
        int sellBest = 0;     // Final result (maximum profit)

       for(int i = 1; i < price.length; i++){
           sell = price[i];
           int profit = sell - buy;
           if(profit > buy){
               best = profit;
           }

           if (sell < buy){
               buy = sell;
           }
       }
        sellBest = best;
        System.out.println(sellBest);
    }
}