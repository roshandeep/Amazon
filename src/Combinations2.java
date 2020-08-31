import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        Arrays.sort(candidates);
        dfs(res, temp, candidates, target, 0, 0);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> temp, int[] candidates, int target, int start, int sum){

        if(sum>target){
            return;
        }

        if(sum==target){
            res.add(new ArrayList<Integer>(temp));
            return;
        }

        int prev=-1;
        for(int i=start;i<candidates.length;i++){
            if(prev!=candidates[i]){
                temp.add(candidates[i]);
                dfs(res, temp, candidates, target, i+1, sum+candidates[i]);
                temp.remove(temp.size()-1);
                prev=candidates[i];
            }
        }
    }

    public static void main(String[] args) {
        Combinations2 obj=new Combinations2();
        List<List<Integer>> res= obj.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        for (List<Integer> subset: res) {
            System.out.println(subset);
        }
    }
}
