import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAllSubarraysWith0Sum {

    private static <K, V> void insert(Map<K, List<V>> hashMap, K key, V value) {
        hashMap.putIfAbsent(key, new ArrayList<>());
        hashMap.get(key).add(value);
    }

    public void printAllSubarrays(int[] nums) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        int sum = 0;
        insert(hm, 0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (hm.containsKey(sum)) {
                List<Integer> list = hm.get(sum);
                for (Integer value : list) {
                    System.out.print(value);
                }
                System.out.println();
            }
            insert(hm, sum, i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        PrintAllSubarraysWith0Sum obj = new PrintAllSubarraysWith0Sum();
        obj.printAllSubarrays(nums);
    }
}
