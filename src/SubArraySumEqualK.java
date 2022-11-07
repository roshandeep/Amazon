import java.util.HashMap;

public class SubArraySumEqualK {
    public int subarraySum(int[] nums, int k) {
        int res=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int curr_sum=0;
        hm.put(0,0);
        for (int i = 0; i < nums.length; i++) {
            curr_sum=curr_sum+nums[i];
            if(hm.containsKey(curr_sum)){
                hm.put(curr_sum, hm.get(curr_sum)+1);
            }
            else{
                hm.put(curr_sum, 1);
            }

            if(hm.containsKey(curr_sum-k)){
                res=res+1;
            }
        }

        return res;
//        https://www.youtube.com/watch?v=HbbYPQc-Oo4&ab_channel=TECHDOSE
    }

    public static void main(String[] args) {
        SubArraySumEqualK obj = new SubArraySumEqualK();
        int nums[] = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
//        int nums[] = {1, 1, 1};
//        int k = 2;

//        int nums[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
//        int k = 0;
        System.out.println(obj.subarraySum(nums, k));
    }
}
