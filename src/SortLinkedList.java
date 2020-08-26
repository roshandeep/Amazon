public class SortLinkedList {

    public static void main(String[] args) {

        ListNode head = new ListNode(7);
        head.next = new ListNode(4);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(9);
        SortLinkedList obj = new SortLinkedList();
        ListNode curr = obj.sortList(head);

        while (curr != null) {
            System.out.print(curr.val + " ->");
            curr = curr.next;
        }
        System.out.println();

    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        ListNode sortedList = merge(left, right);
        return sortedList;
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode ptr1 = left;
        ListNode ptr2 = right;
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val > ptr2.val) {
                curr.next = ptr2;
                ptr2 = ptr2.next;
            } else {
                curr.next = ptr1;
                ptr1 = ptr1.next;
            }
            curr = curr.next;
        }
        if (ptr1 == null) {
            curr.next = ptr2;
        }
        if (ptr2 == null) {
            curr.next = ptr1;
        }

        return dummy.next;
    }
}
