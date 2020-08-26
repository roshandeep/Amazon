import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> res=new ArrayList<String>();
        String str="";
        dfs(res, root, str);
        return res;
    }

    public void dfs(List<String> res, TreeNode node, String str){

        if(node==null){
            return;
        }

        str=str+"->"+node.val;
        if(node.left==null && node.right==null){
            res.add(str.substring(2));
        }

        if(node.left!=null){
            dfs(res, node.left, str);
        }
        if(node.right!=null){
            dfs(res, node.right, str);
        }
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);
        head.right =new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);

        BinaryTreePath obj=new BinaryTreePath();

        List<String> res = obj.binaryTreePaths(head);
        System.out.println(res);
    }
}
