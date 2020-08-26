public class ReverseInKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;

        prev.next=head;

        while(true){
            ListNode counter=prev.next;
            int count =0;
            while(counter!=null){
                ++count;
                if(count ==k){
                    break;
                }
                counter=counter.next;
            }
            if(count <k){
                break;
            }

            ListNode start=prev.next;
            ListNode prev2=null;
            ListNode curr=prev.next;
            ListNode next=null;

            for(int i=1;i<=k;i++){
                next=curr.next;
                curr.next=prev2;
                prev2=curr;
                curr=next;
            }
            prev.next=prev2;
            start.next=curr;
            prev=start;
        }


        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next =new ListNode(2);
        head.next.next =new ListNode(3);
        head.next.next.next =new ListNode(4);
        head.next.next.next.next =new ListNode(5);
        head.next.next.next.next.next =new ListNode(6);
        head.next.next.next.next.next.next =new ListNode(7);
        head.next.next.next.next.next.next.next =new ListNode(8);

        ListNode check=head;
        while (check!=null){
            System.out.print(check.val + "-> ");
            check=check.next;
        }
        System.out.println();
        ReverseInKGroups obj=new ReverseInKGroups();
        ListNode curr = obj.reverseKGroup(head,3);

        while (curr!=null){
            System.out.print(curr.val + "-> ");
            curr=curr.next;
        }
    }
}
