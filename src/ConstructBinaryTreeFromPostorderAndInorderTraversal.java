public class ConstructBinaryTreeFromPostorderAndInorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int poststart=0, postend=postorder.length-1;
        int instart=0, inend=inorder.length-1;
        TreeNode root= helper(postorder, inorder, poststart, postend, instart, inend);
        return  root;
    }

    public TreeNode helper(int postorder[], int inorder[], int poststart, int postend, int instart, int inend){
        if(poststart>postend || instart>inend){
            return null;
        }
        int val=postorder[postend];
        TreeNode root=new TreeNode(val);

        int middle=0;
        for(int i=0;i<inorder.length;i++){
            if(val==inorder[i]){
                middle=i;
                break;
            }
        }

        root.left=helper(postorder, inorder, poststart, poststart+middle-(instart+1), instart, middle-1);
        root.right=helper(postorder, inorder, poststart+middle-instart, postend-1, middle+1, inend);

        return root;
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromPostorderAndInorderTraversal obj=new ConstructBinaryTreeFromPostorderAndInorderTraversal();
        int inorder[] = new int[] {9,3,15,20,7};
        int postorder[] = new int[] {9,15,7,20,3};
        TreeNode root=obj.buildTree(inorder, postorder);
        printInorder(root);
    }

    static void printInorder(TreeNode node){
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }
}
