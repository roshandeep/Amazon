public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int total=nums[0], grandtotal = nums[0];


        for(int i=1;i<nums.length;i++){

            total=total+nums[i];
            if(total<nums[i]){
                total=nums[i];
            }

            if(grandtotal<total){
                grandtotal=total;
            }
        }

        return grandtotal;
    }

    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray obj=new MaximumSubarray();
        int total = obj.maxSubArray(nums);
        System.out.println(total);
    }
}
