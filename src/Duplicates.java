public class Duplicates {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return head;
        }

        ListNode p1=head;
        ListNode p2=head.next;

        while(p1!=null && p2!=null){
            if(p1.val == p2.val){
                p1.next=p2.next;
            }
            p1=p1.next;
            p2=p2.next;

        }

        return head;
    }

    public static void main(String args[]){
        ListNode node = new ListNode(1);
        node = new ListNode(1);
        node = new ListNode(2);
        node = new ListNode(3);
        node = new ListNode(3);
        node = new ListNode(3);

        Duplicates obj=new Duplicates();
        obj.deleteDuplicates(node);
    }
}


