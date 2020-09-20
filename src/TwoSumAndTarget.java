import java.util.HashMap;

public class TwoSumAndTarget {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
        int ans[] =new int[2];

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                ans[0] = map.get(diff);
                ans[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        TwoSumAndTarget obj=new TwoSumAndTarget();
        int nums[] = {2,7,11,15};
        int target = 9;
        int ans[] = obj.twoSum(nums, target);
        System.out.print(ans[0] + " " +ans[1]);
    }
}

