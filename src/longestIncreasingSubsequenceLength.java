public class longestIncreasingSubsequenceLength {
    public static void main(String[] args) {
        int arr[]={ 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println("\n" + LIS(arr));
    }

    private static int LIS(int[] arr) {
        int lis[] = new int[arr.length];
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            lis[i]=1;
        }

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
            }
        }

        for(int i=0;i<lis.length;i++){
            max=Math.max(max,lis[i]);
        }

        for(int i=0;i<lis.length;i++){
            System.out.print(lis[i] + " ");
        }
        return max;
    }
}
