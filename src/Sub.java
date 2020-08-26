class Sub {
    public static boolean repeatedSubstringPattern(String s) {
        if(s.length() == 0){
            return false;
        }

        String sub="";
        for(int i=1;i<(s.length()/2)+1;i++){
            sub = s.substring(0,i);
            String newstr=sub;
            while(newstr.length()<=s.length()){
                if(newstr.equals(s)){
                    return true;
                }
                else{
                    newstr=newstr+sub;
                }
            }

        }
        return false;
    }

    public static void main(String args[]){
        Boolean ans;

        ans = repeatedSubstringPattern("abab");
        System.out.println(ans);
    }
}
