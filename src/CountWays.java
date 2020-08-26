public class CountWays {

    //Count ways to reach the nth stair using step 1, 2 or 3

    //Recursion
    public static int findWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        else
        if(n==2){
            return 2;
        }
        else{
            return findWays(n-3) + findWays(n-2) + findWays(n-1);
        }
    }

    //DP
    public static int findWays2(int n){
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
        for(int i=3;i<=n;i++) {
            res[i]=res[i-3]+res[i-2]+res[i-1];
        }
        return res[n];
    }

    public static void main(String[] args) {
        int n=5;

        System.out.println(findWays(n));
        System.out.println(findWays2(n));
    }
}
