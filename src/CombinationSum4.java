import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        Arrays.sort(nums);
        helper(res, temp, nums, 0, target);
        return res.size();
    }

    private void helper(List<List<Integer>> res, List<Integer> temp, int[] nums, int index, int sum) {
        if(sum<0){
            return;
        }
        if(sum==0){
            res.add(new ArrayList<>(temp));
        }

        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            helper(res, temp, nums, 0, sum-nums[i]);
            temp.remove(temp.size()-1);
        }
    }

    public int combinationSum4DP(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int[] dp = new int[target+1];
        dp[0]=1;
        for(int i=1; i<=target; i++){
            for(int ways:dp){
                System.out.print(ways+" ");
            }
            System.out.println();
            for(int j=0;j<nums.length;j++){
                if(i-nums[j]>=0){
                    dp[i]=dp[i]+dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        CombinationSum4 obj = new CombinationSum4();
        int arr[] = {1, 2, 4};
        int res = obj.combinationSum4DP(arr, 6);
        System.out.println(res);
    }
}
