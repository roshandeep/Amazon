public class CoinChange {
    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int sum = 8;
        int count[][]=new int[coins.length][sum+1];

        int noOfCoins=coins.length;
        for(int i=0;i<noOfCoins;i++){
            count[i][0]=1;
        }

        for(int i=0;i<noOfCoins;i++){
            for(int j=1;j<=sum;j++){
                int includingCurrentCoin=0, excludingCurrentCoin=0;

                if(i>0){
                    excludingCurrentCoin = count[i-1][j];
                }
                if(coins[i] <= j){
                    includingCurrentCoin = count[i][j - coins[i]];
                }
                count[i][j] = includingCurrentCoin + excludingCurrentCoin;
            }
        }

        for(int i=0;i<noOfCoins;i++){
            for(int j=0;j<=sum;j++){
                System.out.print(count[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(count[noOfCoins-1][sum]);
    }
}

