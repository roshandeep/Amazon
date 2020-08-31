import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<>();
        helper(result, temp, 0, nums);
        return  result;
    }

    private void helper(List<List<Integer>> result, List<Integer> temp, int index, int[] nums) {
        result.add(new ArrayList<Integer>(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            helper(result, temp, i+1, nums);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        Subsets obj=new Subsets();
        int arr[]={1, 2, 3};
        List<List<Integer>> res= obj.subsets(arr);
        for (List<Integer> subset: res) {
            System.out.println(subset);
        }
    }
}
