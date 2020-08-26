import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        if(s.length()==0){
            return 0;
        }

        HashSet<Character> hs=new HashSet<Character>();
        int i=0,j=0;
        int maxlength=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(!hs.contains(ch)){
                hs.add(ch);
                j++;
                int length = hs.size();
                maxlength = Math.max(maxlength, length);
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
        }

        return maxlength;
    }

    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
