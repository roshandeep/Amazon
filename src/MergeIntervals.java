import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2)->Integer.compare(arr1[0],arr2[0]));
        Stack<int[]> stack =new Stack<>();
        stack.push(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int curr[]=stack.peek();
            if(curr[1]<intervals[i][0]){
                stack.push(intervals[i]);
            }
            else{
                curr[1]=Math.max(curr[1],intervals[i][1]);
                stack.pop();
                stack.push(curr);
            }
        }

        return stack.toArray(new int[stack.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals obj=new MergeIntervals();
        //int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
        //int intervals[][] = {{1,4},{0,4}};
        int intervals[][] = {{1,4},{2,3}};
        int res[][]= obj.merge(intervals);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i][0] + " " + res[i][1]);
            System.out.println();
        }
    }
}
