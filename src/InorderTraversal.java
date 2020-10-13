import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);
        head.right =new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);

        List<Integer> res= obj.inorderTraversal(head);
        for (int num: res){
            System.out.println(num);
        }
    }
}
