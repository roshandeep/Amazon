import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        HashMap<String, ArrayList<String>> map =new HashMap<String, ArrayList<String>>();

        for(String str: strs){
            char[] arr = new char[26];
            for(char ch : str.toCharArray()){
                arr[ch-'a']++;
            }
            String ns = new String(arr);

            if(map.containsKey(ns)){
                map.get(ns).add(str);
            }
            else{
                ArrayList<String> al=new ArrayList<String>();
                al.add(str);
                map.put(ns, al);
            }
        }

        ans.addAll(map.values());
        return ans;
    }

    public static void main(String[] args) {
        GroupAnagrams obj=new GroupAnagrams();
        String strs[]={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = obj.groupAnagrams(strs);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
