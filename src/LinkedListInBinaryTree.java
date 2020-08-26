public class LinkedListInBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {

        if(head==null){
            return true;
        }
        if(root==null){
            return false;
        }
        return check(head,root) || isSubPath(head,root.left) || isSubPath(head,root.right);
    }

    public static boolean check(ListNode head, TreeNode root){
        if(head==null){ //parsed through entire linkedlist
            return true;
        }
        if(root==null){
            return false;
        }

        if(head.val==root.val){
            return(check(head.next,root.left) || check(head.next,root.right));
        }

        return false;
    }
}
