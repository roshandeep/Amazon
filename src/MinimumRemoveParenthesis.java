public class MinimumRemoveParenthesis {
    public String minRemoveToMakeValid(String s) {

        String newstr = "";
        String str2 = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '(' && ch != ')') {
                newstr = newstr + ch;
            } else if (ch == '(') {
                count++;
                newstr = newstr + ch;
            } else if (ch == ')') {
                if (count == 0) {
                    continue;
                } else {
                    count--;
                    newstr = newstr + ch;
                }
            }
        }

        if (count > 0) {
            for (int i = newstr.length() - 1; i >= 0; i--) {
                char ch = newstr.charAt(i);
                if (ch == '(' && count > 0) {
                    count = count - 1;
                    continue;
                } else {
                    str2 = ch + str2;
                }
            }
            return str2;
        }
        return newstr;
    }

    public static void main(String[] args) {
        MinimumRemoveParenthesis obj=new MinimumRemoveParenthesis();
        String str= obj.minRemoveToMakeValid("))((");
        System.out.println(str);
    }
}

