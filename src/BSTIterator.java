import java.util.LinkedList;
import java.util.Queue;

public class BSTIterator {
    Queue<Integer> queue;

    public BSTIterator(TreeNode root) {
        queue=new LinkedList<Integer>();
        extractNodes(root, queue);
    }

    public void extractNodes(TreeNode root, Queue<Integer> queue){
        if(root==null){
            return;
        }
        extractNodes(root.left, queue);
        queue.add(root.val);
        extractNodes(root.right, queue);
    }

    /** @return the next smallest number */
    public int next() {
        return queue.poll();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(queue.size()>0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);
        head.right =new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);

        BSTIterator obj=new BSTIterator(head);
        System.out.println(obj.hasNext());
        System.out.println(obj.next());
        System.out.println(obj.hasNext());
        System.out.println(obj.next());
        System.out.println(obj.hasNext());
        System.out.println(obj.next());
        System.out.println(obj.hasNext());
        System.out.println(obj.next());
    }
}
