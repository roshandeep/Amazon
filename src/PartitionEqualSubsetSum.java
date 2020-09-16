public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }

        if(sum%2 != 0){
            return false;
        }

        sum=sum/2;
        boolean sum_combo[]=new boolean[sum+1];
        for(int i=0;i<sum_combo.length;i++){
            sum_combo[i]=false;
        }
        sum_combo[0]=true;

        for(int num : nums){
            for(int j=sum;j>=num;j--){
                sum_combo[j]= sum_combo[j] || sum_combo[j-num];
            }
        }

        return sum_combo[sum];
    }

    public static void main(String[] args) {
        PartitionEqualSubsetSum obj=new PartitionEqualSubsetSum();
        int arr[]={1, 5, 11, 5};
        System.out.println(obj.canPartition(arr));
    }
}
