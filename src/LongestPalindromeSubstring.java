public class LongestPalindromeSubstring {

    public static String longestPalindrome(String s) {

        if(s.length()==0 || s==null){
            return "";
        }

        String longest="";
        for(int i=0;i<s.length();i++){
            // Even length palindrome.
            String s1=centreExpand(s,i,i);
            // Odd length palindrome.
            String s2=centreExpand(s,i,i+1);
            String str=s1.length()>s2.length()? s1:s2;
            longest = longest.length()>str.length()? longest:str;

        }

        return longest;
    }

    public static String centreExpand(String s, int l, int r){
        if(s.length()==0 || l>r){
            return "";
        }

        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        // Since we have traveled one extra on left and right(condition to exit while).
        return s.substring(l+1,r);
    }

    public static void main(String[] args) {
        String s = longestPalindrome("babaduiadabab");
        System.out.println(s);
    }
}
