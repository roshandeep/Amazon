import java.util.Arrays;
import java.util.HashSet;

public class LongestWordInDictionary {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet set=new HashSet();
        String sub=words[0];
        int maxLen=Integer.MIN_VALUE;
        for(int i=0;i<words.length;i++){
            int len=words[i].length();
            if(set.contains(words[i].substring(0,len-1)) || len==1){
                set.add(words[i]);
                if(len>maxLen){
                    sub=words[i];
                    maxLen=len;
                }
            }
        }
        return sub;
    }

    public static void main(String[] args) {
        LongestWordInDictionary obj=new LongestWordInDictionary();
        //String words[] = {"w","wo","wor","worl", "world"};
        //String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String words[] = {"b","br","bre","brea","break","breakf","breakfa","breakfas","breakfast","l","lu","lun","lunc","lunch","d","di","din","dinn","dinne","dinner"};
        System.out.println(obj.longestWord(words));
    }
}
