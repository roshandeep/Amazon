public class Reverse {

    public String reverse(String str){
        if(str.length() == 0){
            return "";
        }
        str=str+" ";
        String w="";
        StringBuilder rev=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                w=" "+w;
                rev.insert(0, w);
                w="";
            }
            else{
                w=w+str.charAt(i);
            }
        }

        return rev.length() != 0 ? rev.substring(1, rev.length()) : "";
    }

    public static void main(String args[]){
        String str="the sky is blue";
        Reverse obj=new Reverse();
        String rev = obj.reverse(str);
        System.out.println(rev);
    }
}
