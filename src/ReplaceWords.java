import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {

        String arr[]=sentence.split(" ");
        Collections.sort(dictionary);
        String res="";
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            String root="";
            for(int j=0;j<dictionary.size();j++){
                if(word.startsWith(dictionary.get(j))){
                    root=dictionary.get(j);
                    break;
                }
            }
            if(root==""){
                res=res+word+" ";
            }
            else{
                res=res+root+" ";
            }

        }
        return res.trim();
    }

    public static void main(String[] args) {
        ReplaceWords obj=new ReplaceWords();
        String array[] = {"cat","bat","rat"};
        //String array[] = {"a", "aa", "aaa", "aaaa"};
        //String array[] = {"ac","ab"};
        List<String> dictionary = Arrays.asList(array);
        String sentence = "the cattle was rattled by the battery";
        //String sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";
        //String sentence = "it is abnormal that this solution is accepted";
        String res = obj.replaceWords(dictionary, sentence);
        System.out.println(res);
    }
}
