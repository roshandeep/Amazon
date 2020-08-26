import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if(root==null){
            return res;
        }

        queue.add(root);

        while(queue.size()!=0){

            int nodeCount = queue.size();
            List<Integer> rowResult=new LinkedList<Integer>();
            while(nodeCount>0){

                TreeNode current = queue.remove();
                if(current.left!=null){
                    queue.add(current.left);
                }

                if(current.right!=null){
                    queue.add(current.right);
                }

                rowResult.add(current.val);
                nodeCount--;
            }
            res.add(rowResult);
        }

        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);
        head.right =new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);

        LevelOrderTraversal obj=new LevelOrderTraversal();

        List<List<Integer>> res = obj.levelOrderBottom(head);
        System.out.println(res);
    }
}
