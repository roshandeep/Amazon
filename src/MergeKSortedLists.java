public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || lists==null){
            return null;
        }
        int k=lists.length-1;
        while (k!=0){
            int i=0, j=k;
            while(i<j){
                lists[i]=merge(lists[i], lists[j]);
                i++;
                j--;
                if(i>=j){
                    k=j;
                }
            }
        }
        return lists[0];
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode mergedList=null;
        if(l1==null){
            return l2;
        }
        else
        if(l2==null){
            return l1;
        }

        if(l1.val<=l2.val){
            mergedList=l1;
            mergedList.next=merge(l1.next,l2);
        }
        else if(l2.val<=l1.val){
            mergedList=l2;
            mergedList.next=merge(l2.next,l1);
        }

        return mergedList;
    }

    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];

        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(5);
        lists[0].next.next = new ListNode(7);

        lists[1] = new ListNode(2);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(6);
        lists[1].next.next.next = new ListNode(9);

        lists[2] = new ListNode(4);
        lists[2].next = new ListNode(8);
        lists[2].next.next = new ListNode(10);

        MergeKSortedLists obj=new MergeKSortedLists();
        ListNode head = obj.mergeKLists(lists);
        printList(head);
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("null");
    }
}
