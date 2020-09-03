import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates, 0, target, 0, temp, result);
        return result;
    }

    private void helper(int[] candidates, int start, int target, int sum, List<Integer> list, List<List<Integer>> result){
        if(sum>target){
            return;
        }

        if(sum==target){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=start; i<candidates.length; i++){
            list.add(candidates[i]);
            helper(candidates, i, target, sum+candidates[i], list, result);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        CombinationSum1 obj = new CombinationSum1();
        int arr[]={2, 3, 6, 7};
        List<List<Integer>> res = obj.combinationSum(arr, 7);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
