import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElementInArray {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums) {
            pq.add(i);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.poll();
    }

    public static void main(String[] args) {
        KLargestElementInArray obj = new KLargestElementInArray();
        int arr[] = {13, 22, 100, 65, 36, 45, 82, 36, 29};
        int k = 2;
        int res = obj.findKthLargest2(arr, k);
        System.out.print(res);
    }
}
