public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode curr=head;
        int len=0;
        while(curr!=null){
            len=len+1;
            curr=curr.next;
        }
        curr=head;
        k=k%len;
        for(int i=1;i<len-k;i++){
            curr=curr.next;
        }

        ListNode temp=curr;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head=curr.next;
        curr.next=null;

        return head;
    }

    public static void main(String[] args) {
        RotateList obj=new RotateList();
        ListNode head=new ListNode(1);
        head.next =new ListNode(2);
        head.next.next =new ListNode(3);
        head.next.next.next =new ListNode(4);
        head.next.next.next.next =new ListNode(5);
        head.next.next.next.next.next =new ListNode(6);
        ListNode res=obj.rotateRight(head,3);

        while(res!=null){
            System.out.print(res.val + "->");
            res=res.next;
        }
    }
}
