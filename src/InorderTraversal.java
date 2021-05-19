import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* Constructed binary tree is
            1
          /   \
        2      3
      /  \    /  \
    4     5  6    7
  */

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();

        if(root==null){
            return res;
        }
        TreeNode curr=root;
        while(curr!=null || stack.size()>0){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;
    }

    public static void main(String[] args) {
        InorderTraversal obj=new InorderTraversal();

        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right =new TreeNode(3);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);

        List<Integer> res= obj.inorderTraversal(head);
        for (int num: res){
            System.out.print(num + " ");
        }
    }
}
