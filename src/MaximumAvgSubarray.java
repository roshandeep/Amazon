public class MaximumAvgSubarray {
    public double findMaxAverage(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        int counter = 0, total = 0;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
            if(i>=k-1){
                max=Math.max(total,max);
                total=total-nums[counter];
                counter++;
            }
        }
        return (max+0.0)/k;
    }

    public static void main(String[] args) {
        int nums[]={1,12,-5,-6,50,3};
        MaximumAvgSubarray obj=new MaximumAvgSubarray();
        System.out.println(obj.findMaxAverage(nums,4));
    }
}
