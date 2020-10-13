import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();

        TreeNode curr=root;
        while(curr!=null || stack.size()>0){
            while(curr!=null){
                res.add(curr.val);
                stack.push(curr);
                curr=curr.right;
            }
            curr=stack.pop();
            curr=curr.left;
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        PostorderTraversal obj=new PostorderTraversal();

        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right =new TreeNode(3);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);

        List<Integer> res= obj.postorderTraversal(head);
        for (int num: res){
            System.out.print(num + " ");
        }
    }
}
