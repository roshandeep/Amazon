public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int prestart=0, preend=preorder.length-1;
        int instart=0, inend=inorder.length-1;
        TreeNode root= helper(preorder, inorder, prestart, preend, instart, inend);
        return  root;
    }

    public TreeNode helper(int preorder[], int inorder[], int prestart, int preend, int instart, int inend){
        if(prestart>preend || instart>inend){
            return null;
        }

        int val= preorder[prestart];
        TreeNode root=new TreeNode(val);

        int middle=0;
        for(int i=0;i<inorder.length;i++){
            if(val==inorder[i]){
                middle=i;
                break;
            }
        }

        root.left=helper(preorder, inorder, prestart+1, preend, instart, middle-1);
        root.right=helper(preorder, inorder, prestart+middle-instart+1, preend, middle+1, inend);

        return root;
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromPreorderAndInorderTraversal obj=new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        int inorder[] = new int[] {9,3,15,20,7};
        int preorder[] = new int[] {3,9,20,15,7};
        TreeNode root=obj.buildTree(preorder, inorder);
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
