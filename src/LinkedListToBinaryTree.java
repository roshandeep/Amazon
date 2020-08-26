public class LinkedListToBinaryTree {
    public static TreeNode sortedListToBST(ListNode head) {

        if(head==null){
            return null;
        }

        if(head.next==null){
            TreeNode root=new TreeNode(head.val);
            return root;
        }

        ListNode node=getMid(head);
        TreeNode root=new TreeNode(node.val);
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(node.next);
        return root;
    }

    public static ListNode getMid(ListNode head){
        if(head==null){
            return null;
        }

        if(head.next==null){
            return null;
        }

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=null;
        return slow;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(-10);
        head.next =new ListNode(-3);
        head.next.next =new ListNode(0);
        head.next.next.next =new ListNode(5);
        head.next.next.next.next =new ListNode(9);
        head.next.next.next.next.next =new ListNode(20);

        ListNode mid=getMid(head);
        System.out.println(mid.val);

        TreeNode root = sortedListToBST(head);
    }
}
