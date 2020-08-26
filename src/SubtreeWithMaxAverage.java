public class SubtreeWithMaxAverage {

    double maxavg = Integer.MIN_VALUE;
    NaryTreeNode maxNode = null;

    public NaryTreeNode maximumAverageSubtree(NaryTreeNode root) {
        if (root == null){
            return null;
        }
        helper(root);
        return maxNode;
    }

    public double[] helper(NaryTreeNode root){

        if(root==null){
            return new double[] {0.0,0.0};
        }
        double currTotal=root.val;
        double currcount=1;

        for(NaryTreeNode child: root.children){
            double curr[]=helper(child);
            currTotal=currTotal+curr[0];
            currcount=currcount+curr[1];
        }

        double avg=currTotal/currcount;
        if(maxavg<avg && currcount>1){
            maxavg=avg;
            maxNode=root;
        }
        return new double[] {currTotal, currcount};
    }

    public static void main(String[] args) {
        NaryTreeNode head=new NaryTreeNode(20);

        head.children.add(new NaryTreeNode(12));
        head.children.add(new NaryTreeNode(18));

        head.children.get(0).children.add(new NaryTreeNode(11));
        head.children.get(0).children.add(new NaryTreeNode(12));
        head.children.get(0).children.add(new NaryTreeNode(13));

        head.children.get(1).children.add(new NaryTreeNode(15));
        head.children.get(1).children.add(new NaryTreeNode(8));

        SubtreeWithMaxAverage obj=new SubtreeWithMaxAverage();
        NaryTreeNode node = obj.maximumAverageSubtree(head);
        printTree(node);
    }

    public static void printTree(NaryTreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        for(int i=0;i<root.children.size();i++){
            printTree(root.children.get(i));
        }
    }
}
