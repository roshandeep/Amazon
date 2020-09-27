import java.util.ArrayList;
import java.util.List;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int n=0;
        List<Integer> num=new ArrayList<Integer>();
        while(head!=null){
            num.add(head.val);
            head=head.next;
        }

        for(int i=num.size()-1;i>=0;i--){
            n=n+(int)(Math.pow(2,num.size()-i-1)*num.get(i));
        }
        return n;
    }

    public static void main(String[] args) {
        ConvertBinaryNumberInALinkedListToInteger obj=new ConvertBinaryNumberInALinkedListToInteger();
        ListNode head=new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(1);

        System.out.println(obj.getDecimalValue(head));
    }
}
