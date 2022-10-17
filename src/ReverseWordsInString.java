public class ReverseWordsInString {

    public String rotate(String str) {
        String newstr = "";
        if (str == null || str.length() == 0) {
            return "";
        }
        String word = "";
        str=str+" ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                newstr = word + " " + newstr;
                word = "";
            }
        }
        return newstr.trim();
    }

    public String reverseWords(String s) {
        if(s==null || s.length()==0){
            return "";
        }

        String str[]=s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=str.length-1;i>=0;i--){
            if(!str[i].equals("")){
                sb=sb.append(str[i]).append(" ");
            }
        }

        return sb.length()==0 ? "" : sb.toString().substring(0,sb.length()-1);
    }

    public static void main(String[] args) {
//        String s = "the sky is blue";
        String s = "a good   example";
        ReverseWordsInString obj = new ReverseWordsInString();
        String newstr = obj.rotate(s);
        System.out.println(newstr);
    }
}
