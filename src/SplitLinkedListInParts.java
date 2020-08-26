public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode curr=root;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count=count+1;
        }
        ListNode res[]=new ListNode[k];
        int mingrpsize=count/k;
        int extra=0;
        if(mingrpsize==0){
            mingrpsize=1;
        }
        else
        if(mingrpsize*k<count){
            extra=count-(mingrpsize*k);
        }
        curr=root;
        int index=0;
        while(index<k){
            int i=0;
            int grpsize=mingrpsize;
            if(extra>0){
                grpsize=grpsize+1;
            }
            ListNode start=curr;
            while(i<grpsize && curr!=null){
                if(i+1==grpsize){
                    ListNode temp=curr.next;
                    curr.next=null;
                    curr=temp;
                }else{
                    curr=curr.next;
                }
                i++;
            }

            res[index]=start;
            index=index+1;
            extra=Math.max(0,extra-1);
        }

        return res;
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
        head.next.next.next.next.next.next.next.next =new ListNode(9);
        head.next.next.next.next.next.next.next.next.next =new ListNode(10);

        SplitLinkedListInParts obj=new SplitLinkedListInParts();
        ListNode res[] = obj.splitListToParts(head,3);

        for(int i=0;i<res.length;i++){
            ListNode curr=res[i];
            while(curr!=null){
                System.out.print(curr.val + " ->");
                curr=curr.next;
            }
            System.out.println();
        }
    }
}

