import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<>();
        helper(result, temp, 0, nums);
        return result;
    }

    public static void helper(List<List<Integer>> result, List<Integer> temp, int index, int[] nums){
        result.add(new ArrayList<Integer>(temp));
        HashSet hs=new HashSet();
        for(int i=index;i<nums.length;i++){
            if(hs.add(nums[i])){
                temp.add(nums[i]);
                helper(result,temp,i+1,nums);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Subsets2 obj=new Subsets2();
        int arr[]={1, 2, 2};
        List<List<Integer>> res= obj.subsetsWithDup(arr);
        for (List<Integer> subset: res) {
            System.out.println(subset);
        }
    }
}
