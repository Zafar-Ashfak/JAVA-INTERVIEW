package Searching;

public class StockMarket {
   public static int buyAndSellStocks(int[] prices) { // O(n)
       int maxProfit = 0;
       int buyingPrice = Integer.MAX_VALUE;

       for (int i = 0; i < prices.length; i++) {
           // prices[i] == sellingPrice
           if (buyingPrice < prices[i]) {
               int currProfit = prices[i] - buyingPrice;
               maxProfit = Math.max(maxProfit, currProfit);
           } else {
               buyingPrice = prices[i];
           }
       }

       return maxProfit;
   }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = buyAndSellStocks(prices);
        System.out.println("Maximum profit for buying and selling stocks is: " + maxProfit);
    }
}
