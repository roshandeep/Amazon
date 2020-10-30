import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeFindMode {
    HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
    int max=1;
    public int[] findMode(TreeNode root) {
        List<Integer> modes=new ArrayList<Integer>();
        findFreq(root);
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==max){
                modes.add(entry.getKey());
            }
        }
        int arr[]=modes.stream().mapToInt(i->i).toArray();
        return arr;
    }

    public void findFreq(TreeNode root){
        if(root == null){
            return;
        }

        if(map.containsKey(root.val)){
            int freq=map.get(root.val);
            freq++;
            map.put(root.val, freq);
            if(freq>max){
                max=freq;
            }
        }
        else{
            map.put(root.val,1);
        }
        findFreq(root.left);
        findFreq(root.right);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(2147483647);
//        head.left = new TreeNode(2);
//        head.right =new TreeNode(2);
//        head.right.left = new TreeNode(3);
//        head.right.right = new TreeNode(3);
//        head.left.left = new TreeNode(3);
//        head.left.right = new TreeNode(2);

        TreeFindMode obj=new TreeFindMode();
        int arr[] = obj.findMode(head);
        for (int num: arr) {
            System.out.println(num);
        }

    }
}
