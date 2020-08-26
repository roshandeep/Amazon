public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        //int len=characterReplacement("ABBBAAHHAGTAAABB", 2);
        int len=characterReplacement("AABAABBA", 1);
        System.out.println(len);
    }
    public static int characterReplacement(String s, int k) {
        int maxlen=0;
        int start=0,end=0;

        int freq[]=new int[26];
        int maxfreq=0;

        for(end=0;end<s.length();end++){
            freq[s.charAt(end)-'A']++;
            maxfreq=Math.max(maxfreq,  freq[s.charAt(end)-'A']);
            while((end-start+1)-maxfreq > k){
                freq[s.charAt(start)-'A']--;
                start++;
            }

            maxlen=Math.max(maxlen, (end-start+1));
        }

        return maxlen;
    }

    
}
