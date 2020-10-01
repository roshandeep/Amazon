import java.util.Stack;

public class ScoreOfParentheses {

    public int scoreOfParentheses(String S) {

        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                st.push(0);
            }
            else{
                if(st.peek()==0){
                    st.pop();
                    st.push(1);
                }
                else{
                    int count=0;
                    while(st.peek()!=0){
                        count=count+st.pop();
                    }
                    int val=2*count;
                    st.pop();
                    st.push(val);
                }
            }
        }
        int score=0;
        while(!st.isEmpty()){
            score=score+st.pop();
        }
        return score;
    }

    public static void main(String[] args) {
        ScoreOfParentheses obj=new ScoreOfParentheses();
        String str="(()())";
        System.out.println(obj.scoreOfParentheses(str));
    }
}
