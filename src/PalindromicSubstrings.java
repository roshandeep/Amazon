public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int count = s.length();
        if (s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String str = s.substring(i, j+1);
                boolean flag = checkPalindrome(str);
                if (flag) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean checkPalindrome(String str) {
        StringBuilder s = new StringBuilder(str);
        return str.equals(s.reverse().toString());
    }

    public boolean checkPalindrome2(String str){
        for(int i=0; i<(str.length()/2); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        PalindromicSubstrings obj = new PalindromicSubstrings();
//        String str = "abc";
        String str = "aaa";
        int count = obj.countSubstrings(str);
        System.out.print(count);
    }
}
