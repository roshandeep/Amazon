public class LinkedListPalin {
    public boolean isPalindrome(ListNode head) {

        ListNode curr=head;
        String num="", rev="";
        int digit=0;

        while(curr!=null){

            digit=curr.val;
            num=num+digit;
            rev=digit+rev;
            curr=curr.next;
        }
        if(num.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        LinkedListPalin obj=new LinkedListPalin();
        boolean palin = obj.isPalindrome(head);

        System.out.println(palin);
    }
}
