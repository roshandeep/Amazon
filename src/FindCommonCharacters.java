import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {

        ArrayList<String> res=new ArrayList<String>();
        HashMap<Character, Integer> hm=new HashMap<Character, Integer>();

        String word=A[0];
        for(int i=0;i<word.length();i++){
            if(hm.containsKey(word.charAt(i))){
                hm.put(word.charAt(i), hm.get(word.charAt(i))+1);
            }
            else{
                hm.put(word.charAt(i), 1);
            }
        }

        for(int i=1;i<A.length;i++){
            String str=A[i];
            HashMap<Character, Integer> temp=new HashMap<Character, Integer>();
            for(int j=0;j<str.length();j++){
                if(!hm.containsKey(str.charAt(j))){
                    continue;
                }
                else{
                    if(temp.containsKey(str.charAt(j))){
                        temp.put(str.charAt(j), Math.min(temp.get(str.charAt(j))+1, hm.get(str.charAt(j))));
                    }
                    else{
                        temp.put(str.charAt(j),1);
                    }
                }
            }
            hm=temp;
        }

        for(Character ch: hm.keySet()){
            for(int i=0;i<hm.get(ch);i++){
                res.add(ch.toString());
            }
        }

        return res;
    }

    public static void main(String[] args) {
        FindCommonCharacters obj=new FindCommonCharacters();
        //String words[]={"bella","label","roller"};
        String words[]={"cool","lock","cook"};
        List<String> res = obj.commonChars(words);
        for (String word: res){
            System.out.print(word +  " ");
        }
    }
}
