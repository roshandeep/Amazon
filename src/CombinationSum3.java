import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        dfs(res, temp, k, 1, n);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> temp, int k, int start, int sum){

        if(sum<0){
            return;
        }

        if(sum==0 && temp.size()==k){
            res.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i=start;i<=9;i++){
            temp.add(i);
            dfs(res, temp, k, i+1, sum-i);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        CombinationSum3 obj = new CombinationSum3();
        List<List<Integer>> res = obj.combinationSum3(3, 8);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
