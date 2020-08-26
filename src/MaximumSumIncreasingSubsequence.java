public class MaximumSumIncreasingSubsequence {

    public static void main(String[] args) {
        int arr[]={ 1, 101, 2, 3, 100, 4, 5 };
        System.out.println("\n" + calcMSIS(arr));
    }

    private static int calcMSIS(int[] arr) {
        int msis[] = new int[arr.length];
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            msis[i]=arr[i];
        }
        
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && msis[i]<msis[j]+arr[i]){
                    msis[i]=msis[j]+arr[i];
                }
            }
        }

        for(int i=0;i<msis.length;i++){
            max=Math.max(max,msis[i]);
            System.out.print(msis[i]+" ");
        }

        return max;
    }
}
