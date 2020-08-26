import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {

        Stack<Integer> stack=new Stack<Integer>();
        int sum=0;
        for(int i=0;i<ops.length;i++){
            if(ops[i]=="C"){
                stack.pop();
            }
            else
            if(ops[i]=="D"){
                stack.push(2*stack.peek());
            }
            else
            if(ops[i]=="+"){
                int top=stack.pop();
                int newtop=top+stack.peek();
                stack.push(top);
                stack.push(newtop);
            }
            else if(ops[i]!="C" && ops[i]!="D" && ops[i]!="+"){
                stack.push(Integer.parseInt(ops[i]));
            }
        }

        for(int num:stack){
            sum=sum+num;
        }
        return sum;
    }

    public static void main(String[] args) {
        String arr[]={"5","2","C","D","+"};
        BaseballGame obj=new BaseballGame();
        int ans = obj.calPoints(arr);
        System.out.print(ans);
    }
}
