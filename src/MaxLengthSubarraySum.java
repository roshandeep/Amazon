import java.util.HashMap;

public class MaxLengthSubarraySum {
    public void findMaxLenSubarray(int[] nums, int S) {
        HashMap<Integer, Integer> hm = new HashMap();
        int curr_sum = 0;
        hm.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            curr_sum = curr_sum + nums[i];
            if (hm.containsKey(curr_sum)) {
                hm.put(curr_sum, hm.get(curr_sum) + 1);
            } else {
                hm.put(curr_sum, 1);
            }
        }
    }

    public static void main(String[] args) {
        MaxLengthSubarraySum obj = new MaxLengthSubarraySum();
        int nums[] = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        int k = 0;
        obj.findMaxLenSubarray(nums, k);
    }
}
