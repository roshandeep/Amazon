public class palindrome {
    public static boolean isPalindrome(String s) {

        if(s == ""){
            return true;
        }

        s = s.toLowerCase();
        String newstr="", rev="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2 = s.charAt(s.length()-1-i);

            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                newstr=newstr+ch;
            }
            if((ch2>='a' && ch2<='z') || (ch2>='0' && ch2<='9')){
                rev=rev+ch;
            }
        }

        if(rev.equals(newstr)){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        boolean ans = isPalindrome("A man, a plan, a canal: Panama");
    }
}
