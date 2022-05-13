import java.util.*;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        String res="";
        HashMap<Character, Integer> hm =new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }

        ArrayList<Map.Entry<Character, Integer>> al =new ArrayList<Map.Entry<Character, Integer>>();
        for(Map.Entry<Character, Integer> entryset : hm.entrySet()){
            al.add(entryset);
        }

        FrequencyComparator obj=new FrequencyComparator();
        Collections.sort(al, obj);

        for(Map.Entry<Character, Integer> entryset : al){
            for(int i=0; i<entryset.getValue(); i++){
                res=res+entryset.getKey();
            }
        }

        return res;
    }

    public static void main(String[] args) {
        SortCharactersByFrequency obj=new SortCharactersByFrequency();
//        String str = "tree";
        String str = "Aabb";
        String res = obj.frequencySort(str);
        System.out.println(res);
    }
}

class FrequencyComparator implements Comparator<Map.Entry<Character, Integer>>{
    @Override
    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
        if(o1.getValue() != o2.getValue()){
            return -(o1.getValue()-o2.getValue());
        }
        else{
            return o1.getKey()-o2.getKey();
        }
    }
}