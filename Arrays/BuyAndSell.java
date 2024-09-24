package Arrays;

public class BuyAndSell {

    public static int buyAndSellStocks(int prices[]){
        int buyprice= Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<prices.length; i++){
            if(buyprice <prices[i]){ //PROFIT
                int profit =prices[i]-buyprice;//TODAY PROFIT
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyprice=prices[i];
            }
           
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,3,2,5};
        System.out.println(buyAndSellStocks(prices));

    }
    
}
