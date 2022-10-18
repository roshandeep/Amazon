import java.util.HashSet;

public class CheckIfASubarrayWith0SumExists {

    public static Boolean hasZeroSumSubarray(int[] nums) {
        HashSet<Integer> hs =new HashSet();
        int sum=0;
        hs.add(0);
        for(int i=0; i<nums.length;i++){
            sum=sum+nums[i];
            if(hs.contains(sum)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        CheckIfASubarrayWith0SumExists obj = new CheckIfASubarrayWith0SumExists();
        int nums[] = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        boolean flag = obj.hasZeroSumSubarray(nums);
        System.out.println(flag);
    }
}
