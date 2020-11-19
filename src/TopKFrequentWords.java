import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map=new HashMap<String, Integer>();

        for(String word: words){
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }
            else{
                map.put(word, 1);
            }
        }
        ArrayList<String> res=new ArrayList<String>(map.keySet());
        Collections.sort(res, new Comparator() {
            public int compare(Object obj1, Object obj2){
                Integer a = map.get(obj1);
                Integer b = map.get(obj2);
                int com=b.compareTo(a);
                if(com==0){
                    return obj1.toString().compareTo(obj2.toString());
                }
                return com;
            }
        });

        return res.subList(0, k);
    }

    public static void main(String[] args) {
        TopKFrequentWords obj=new TopKFrequentWords();
        String words[]={"i", "love", "leetcode", "i", "love", "coding"};
        List<String> res = obj.topKFrequent(words, 2);
        for (String word: res){
            System.out.print(word +  " ");
        }
    }
}
