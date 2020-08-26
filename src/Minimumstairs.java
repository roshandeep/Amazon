public class Minimumstairs {

    public static void main(String[] args) {
        int n=5;

        System.out.println(findMinimumWays(n));
    }

    public static int findMinimumWays(int n) {
        if(n==0){
            return 0;
        }
        else
        if(n==1 || n==2 || n==3){
            return 1;
        }
        else{
            return 1 + Math.min( Math.min(findMinimumWays(n-3), findMinimumWays(n-2)), findMinimumWays(n-1));
        }
    }
}
