public class buySell {
    public static void main(String args[]) {
        int[] prices = {7,1,5,3,6,4};
        int min=Integer.MAX_VALUE, minindex=0;

        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
                minindex=i;
            }
        }

        int profit=0, maxindex=0;

        for(int j=minindex;j<prices.length;j++){
            if(prices[j]-min > profit){
                profit=prices[j]-min;
                maxindex=j;
            }
        }

        System.out.println(profit);
    }
}
