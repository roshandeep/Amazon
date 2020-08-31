import java.util.ArrayList;
import java.util.List;

public class Permutation2 {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        dfs(0, nums, res);
        return res;
    }

    public void dfs(int start, int nums[], List<List<Integer>> res){

        if(start==nums.length-1){
            List<Integer> temp=new ArrayList<Integer>();
            for(int num:nums){
                temp.add(num);
            }
            if(!res.contains(temp)){
                res.add(temp);
            }
            return;
        }

        for(int i=start;i<nums.length;i++){
            swap(i, start, nums);
            dfs(start+1, nums, res);
            swap(i, start, nums);
        }
    }

    public void swap(int i, int start, int nums[]){
        int temp=nums[i];
        nums[i]=nums[start];
        nums[start]=temp;
    }

    public static void main(String[] args) {
        Permutation2 obj=new Permutation2();
        int arr[]={1, 1, 3};

        List<List<Integer>> res = obj.permuteUnique(arr);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

