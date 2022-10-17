public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length;i++){
            sum=sum+nums[i];
        }
        int n=nums.length;
        int total = (n*(n+1))/2;

        return total-sum;
    }

    public static void main(String args[]){
        MissingNumber obj =new MissingNumber();
        int nums[] = {3,0,1};
//        int nums[] = {9,6,4,2,3,5,7,0,1};
        System.out.println(obj.missingNumber(nums));
    }
}
