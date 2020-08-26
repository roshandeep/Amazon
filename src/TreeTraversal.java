public class TreeTraversal {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//
//        if (p == null && q == null) return true;
//
//        getInOrder(p, p1);
//        getInOrder(q, q1);
//
//        if(p1.equals(q1)){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//    String p1="", q1="";
//    public void getInOrder(TreeNode node, String value){
//        if(node==null){
//            return;
//        }
//
//        getInOrder(node.left, value);
//        value = value + Integer.toString(node.val);
//        getInOrder(node.right, value);
//    }
//
//    public void anotherway(){
//        if (p == null && q == null) return true;
//
//
//        if (p != null && q != null) {
//            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//        }
//
//
//        return false;
//    }
}
