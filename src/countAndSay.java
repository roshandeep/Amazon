public class countAndSay {
    public static void main(String[] args) {
        int n=5;
        String s="1";
        String newstr="1"; int j=0;
        int count=0;

        for(int i=1;i<=n;i++){
            s=newstr;
            newstr="";
            for(j=0;j<s.length();j++){
                count=1;
                while(j+1 < s.length() && s.charAt(j) == s.charAt(j + 1)){
                    count++;
                    j++;
                }
                newstr=newstr + count + s.charAt(j);
            }
        }

        System.out.println(s);
    }
}
