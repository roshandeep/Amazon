import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
        ArrayList<Map.Entry<Integer, Integer>> al=new ArrayList<Map.Entry<Integer, Integer>>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> e: hm.entrySet()){
            al.add(e);
        }

        NumComparator numobj=new NumComparator();
        Collections.sort(al, numobj);

        int[] arr=new int[k];
        int count=0;
        for(Map.Entry<Integer, Integer> e: al){
            if(count>=k){
                break;
            }
            arr[count]=e.getKey();
            count++;
        }

//        for(Map.Entry<Integer, Integer> e: al){
//            lhm.put(e.getKey(), e.getValue());
//        }
//        for(Map.Entry<Integer, Integer> e: lhm.entrySet()){
//            System.out.println(e.getKey() + " " + e.getValue());
//        }

        return arr;
    }

    public static void main(String[] args) {
        TopKFrequentElements obj=new TopKFrequentElements();
        int nums[] = {1,1,1,2,2,3};
        int arr[] = obj.topKFrequent(nums, 2);
        for(int i: arr){
            System.out.println(i);
        }
    }
}

class NumComparator implements Comparator<Map.Entry<Integer, Integer>>{

    @Override
    public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {

        Integer num1=e1.getValue();
        Integer num2=e2.getValue();
        int val=num1.compareTo(num2);
        if(val>0){
            return -1;
        }
        else if(val<0){
            return 1;
        }
        else {
            return 0;
        }
    }
}
