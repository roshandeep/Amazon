public class BuyAndSell3 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int trans1[]=new int[prices.length];
        int trans2[]=new int[prices.length];
        int profit=0;

        int min=prices[0];
        trans1[0]=0;
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            trans1[i]=Math.max(trans1[i-1],prices[i]-min);
        }

        trans2[trans2.length-1]=0;
        int max=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            max=Math.max(max,prices[i]);
            trans2[i]=Math.max(trans2[i+1],max-prices[i]);
        }

        for(int i=0;i<prices.length;i++){
            profit=Math.max(profit,trans1[i]+trans2[i]);
        }

        return profit;
    }

    public static void main(String[] args) {
        int prices[]={3,3,5,0,0,3,1,4};
        BuyAndSell3 obj=new BuyAndSell3();
        int profit=obj.maxProfit(prices);
        System.out.print(profit);
    }
}
