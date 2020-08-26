import java.util.ArrayList;

public class NaryTreeNode {
    ArrayList<NaryTreeNode> children;
    int val;

    NaryTreeNode(int val){
        this.val=val;
        this.children=new ArrayList<NaryTreeNode>();
    }

}
