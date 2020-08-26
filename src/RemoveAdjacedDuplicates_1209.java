import java.util.Stack;

public class RemoveAdjacedDuplicates_1209 {

    public String removeDuplicates(String s, int k) {
        StringBuilder sb=new StringBuilder();
        //int count[]=new int[26];
        int count=0;
        Stack<Character> stack = new Stack<>();
        Stack charcount=new Stack();

        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                char ch=s.charAt(i);
                stack.push(ch);
                count++;
            }
            else
            if(stack.peek() == s.charAt(i)){
                char ch=s.charAt(i);
                stack.push(ch);
                count++;
                if(count == k){
                    while(count != 0){
                        stack.pop();
                        count--;
                    }
                    if(!stack.isEmpty()){
                        count=(int)charcount.peek();
                        charcount.pop();
                    }
                }
            }
            else{
                char ch=s.charAt(i);
                stack.push(ch);
                charcount.add(count);
                count=1;
            }
        }

        while(!stack.empty()){
            char ch=(char)stack.peek();
            sb.append(ch);
            stack.pop();
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        RemoveAdjacedDuplicates_1209 obj=new RemoveAdjacedDuplicates_1209();
        System.out.println(obj.removeDuplicates("abcd",2));
        System.out.println(obj.removeDuplicates("deeedbbcccbdaa",3));
        System.out.println(obj.removeDuplicates("pbbcggttciiippooaais",2));
    }
}
