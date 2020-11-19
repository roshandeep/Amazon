import java.util.ArrayList;
import java.util.HashMap;

public class MagicDictionary {
    HashMap<Integer, ArrayList<String>> map;

    /** Initialize your data structure here. */
    public MagicDictionary() {
        map=new HashMap<Integer, ArrayList<String>>();
    }

    public void buildDict(String[] dictionary) {
        for(String word: dictionary){
            int len=word.length();
            if(map.containsKey(len)){
                ArrayList<String> temp=map.get(len);
                temp.add(word);
                map.put(len, temp);
            }
            else{
                ArrayList<String> temp=new ArrayList<>();
                temp.add(word);
                map.put(len, temp);
            }
        }
    }

    public boolean search(String searchWord) {
/*        for(Map.Entry<Integer, ArrayList<String>> entry: map.entrySet()){
            System.out.print(entry.getKey());
            for (String word: entry.getValue()) {
                System.out.print(word);
            }
            System.out.println();
        }*/

        int len=searchWord.length();
        if(map.containsKey(len)){
            ArrayList<String> temp=map.get(len);
            for(String word: temp){
                boolean val=check(searchWord, word);
                if(val){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean check(String searchWord, String word){
        int count=0;
        for(int i=0;i<word.length();i++){
            if(searchWord.charAt(i) != word.charAt(i)){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String dictionary[]=new String[2];
        dictionary[0]="hello";
        dictionary[1]="leetcode";
        MagicDictionary obj=new MagicDictionary();
        obj.buildDict(dictionary);


        System.out.println(obj.search("hello"));
        System.out.println(obj.search("hhllo"));
        System.out.println(obj.search("hell"));
    }
}
