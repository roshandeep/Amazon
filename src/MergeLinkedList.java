public class MergeLinkedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode curr1=l1;
        ListNode curr2=l2;
        ListNode merged=null;
        ListNode curr3=null;
        ListNode node=null;

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if (l1 == null && l2 == null){
            return merged;
        }

        while(curr1!=null && curr2!=null){
            if(curr1.val==curr2.val){
                node=new ListNode(curr1.val);
                node.next=new ListNode(curr2.val);
                curr1=curr1.next;
                curr2=curr2.next;
            }
            else
            if(curr1.val<curr2.val){
                node=new ListNode(curr1.val);
                curr1=curr1.next;
            }
            else
            if(curr2.val<curr1.val){
                node=new ListNode(curr2.val);
                curr2=curr2.next;
            }

            if(merged==null){
                merged=node;
            }
            else{
                curr3.next=node;
            }

            if(node.next!=null){
                curr3=node.next;
            }
            else{
                curr3=node;
            }

            if(curr1==null && curr2==null){
                return merged;
            }

            if(curr1==null){
                curr3.next=curr2;
            }

            if(curr2==null){
                curr3.next=curr1;
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next =new ListNode(2);
        l1.next.next =new ListNode(3);
        l1.next.next.next =new ListNode(4);

        ListNode l2 =new ListNode(0);
        l2.next =new ListNode(3);
        l2.next.next =new ListNode(4);
        l2.next.next.next =new ListNode(5);

        MergeLinkedList obj=new MergeLinkedList();
        ListNode curr = obj.mergeTwoLists(l1, l2);

        while (curr!=null){
            System.out.print(curr.val + "-> ");
            curr=curr.next;
        }
    }
}
