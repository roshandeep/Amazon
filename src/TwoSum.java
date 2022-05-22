import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i=0; i<nums.length;i++) {
            int diff = target - nums[i];
            if(hm.containsKey(diff)){
                res[0]=hm.get(diff);
                res[1]=i;
            }
            hm.put(nums[i], i);
        }

        return res;
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int s[] = obj.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.print(s[0] + " " + s[1]);
    }
}
