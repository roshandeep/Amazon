public class InorderSuccessor {

    public static TreeNode findMinimum(TreeNode root)    {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static TreeNode findSuccessor(TreeNode root, TreeNode succ, int key)    {

        if (root == null) {
            return null;
        }

        if (root.val == key){
            if (root.right != null) {
                return findMinimum(root.right);
            }
        }
        else
        if (key < root.val){
            succ = root;
            return findSuccessor(root.left, succ, key);
        }
        else {
            return findSuccessor(root.right, succ, key);
        }

        return succ;
    }

    static void printInorder(TreeNode node){
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }

    public static TreeNode deleteNode(TreeNode root, int key){
        if(root==null){
            return null;
        }

        if(key<root.val){
            root.left=deleteNode(root.left, key);
        }
        else
        if(key>root.val){
            root.right=deleteNode(root.right, key);
        }
        else
        if(key==root.val){

            if(root.right==null && root.left==null){
                root=null;
            }
            else
            if(root.right==null){
                return root.left;
            }
            else{
                TreeNode temp=root;
                TreeNode suc=findMinimum(temp.right);
                suc.left = root.left;
                return root.right;
            }
        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(3);
        head.right =new TreeNode(6);
        head.right.left = new TreeNode(7);
        head.left.right = new TreeNode(2);
        head.left.left = new TreeNode(4);

        printInorder(head);
        System.out.println();
        TreeNode prec = findSuccessor(head, null, 3);

        if (prec != null) {
            System.out.println("Successor of node " + 3 + " is " + prec.val);
        } else {
            System.out.println("Successor doesn't exists for node " + 3);
        }

        deleteNode(head, 3);
        printInorder(head);

        System.out.println();
        prec = findSuccessor(head, null, 3);

        if (prec != null) {
            System.out.println("Successor of node " + 3 + " is " + prec.val);
        } else {
            System.out.println("Successor doesn't exists for node " + 3);
        }
    }
}
