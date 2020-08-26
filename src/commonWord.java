import java.util.HashMap;
import java.util.Map;

public class commonWord {
    public static void main(String[] args) {

        String paragraph="Bob hit a ball, the hit BALL flew far after it was hit.";
        String banned[] = {"hit"};

        paragraph = paragraph.toLowerCase();
        for(int i=0;i<banned.length;i++){
            if(paragraph.contains(banned[i])){
                paragraph = paragraph.replaceAll(banned[i], "");
            }
        }
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        String word="";
        for(int i=0;i<paragraph.length();i++){
            char ch=paragraph.charAt(i);
            if(ch>='a' && ch<='z'){
                word=word+ch;
            }
            else{
                if(map.containsKey(word)){
                    int count=map.get(word);
                    map.put(word, count++);
                }
                else{
                    map.put(word, 1);
                }
                word="";
            }
        }

        int max=0;
        String str="";
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue()>max && entry.getKey()!= ""){
                max=entry.getValue();
                str=entry.getKey();
            }
        }

        System.out.println(str);
    }
}
