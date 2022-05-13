import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evaluate(String tokens[]){
        int res=0;
        String op="+-/*";
        Stack<String> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(op.contains(tokens[i])){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                if(tokens[i] == "+"){
                    stack.push(String.valueOf(a+b));
                }
                else
                if(tokens[i] == "-"){
                    stack.push(String.valueOf(a-b));
                }
                else
                if(tokens[i] == "*"){
                    stack.push(String.valueOf(a*b));
                }
                else
                if(tokens[i] == "/"){
                    stack.push(String.valueOf(a/b));
                }
            }
            else{
                stack.push(tokens[i]);
            }
        }

        return Integer.valueOf(stack.pop());
    }

    public static void main(String[] args){
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        // String[] tokens = new String[] { "4", "13", "5", "/", "+" };
        EvaluateReversePolishNotation obj =new EvaluateReversePolishNotation();
        int res = obj.evaluate(tokens);
        System.out.println(res);
    }
}
