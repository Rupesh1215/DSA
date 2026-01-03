package Arrays;

public class BestTimeToSellBuyStocks121 {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        sellBuyStocks maxProfit = new sellBuyStocks();
        int profit = maxProfit.bestTime(prices);
        System.out.println("Maximum Profit: " + profit);
    }
}

class sellBuyStocks{
    public int bestTime(int[] prices){
        int profit = 0;
        int min = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }

            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}

