import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        Arrays.sort(nums);
        helper(res, temp, nums, target, 0, 0);
        return res.size();
    }

    private void helper(List<List<Integer>> res, List<Integer> temp, int[] nums, int target, int index, int sum) {
        if(sum==0){
            res.add(new ArrayList<>(temp));
        }
    }

    public static void main(String[] args) {
        CombinationSum4 obj = new CombinationSum4();
        int arr[] = {1, 2, 3};
        int res = obj.combinationSum4(arr, 4);
        System.out.println(res);
    }
}
