import java.util.ArrayList;
import java.util.List;

//Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].

public class Combinations1 {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        if(n<k || n<=0){
            return res;
        }

        dfs(res, temp, n, k, 1);
        return res;
    }

    public static void dfs(List<List<Integer>> res, List<Integer> temp, int n, int k, int start){

        if(temp.size()==k){
            res.add(new ArrayList(temp));
            return;
        }

        for(int i=start;i<=n;i++){
            temp.add(i);
            dfs(res, temp, n, k, i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        Combinations1 obj=new Combinations1();
        List<List<Integer>> res= obj.combine(4, 2);
        for (List<Integer> subset: res) {
            System.out.println(subset);
        }
    }
}
