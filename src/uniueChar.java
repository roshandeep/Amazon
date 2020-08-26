public class uniueChar {
    public static void main(String args[]){
        String s="leetcode";
        int alfa[]=new int[26];

        if(s.length()==0){
            System.out.println(-1);
        }

        for(int i=0;i<s.length();i++){
            alfa[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(alfa[s.charAt(i)-'a']==1){
                System.out.println(i);
            }
        }

        System.out.println(-1);
    }
}
