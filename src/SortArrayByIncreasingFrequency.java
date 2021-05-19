import java.util.*;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hm =new HashMap<Integer, Integer>();
        int res[]=new int[nums.length];
        ArrayList<Map.Entry<Integer, Integer>> al =new ArrayList<Map.Entry<Integer, Integer>>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entryset: hm.entrySet()){
            al.add(entryset);
        }

        NumComparator2 numobj=new NumComparator2();
        Collections.sort(al, numobj);

        int count=0;
        for(Map.Entry<Integer, Integer> e: al){
            for(int i=0;i<e.getValue();i++){
                res[count++]=e.getKey();
            }
        }

        return res;
    }

    public static void main(String[] args) {
        SortArrayByIncreasingFrequency obj=new SortArrayByIncreasingFrequency();
        int nums[] = {-1,1,-6,4,5,-6,1,4,1};
        int arr[] = obj.frequencySort(nums);
        for(int i: arr){
            System.out.println(i);
        }
    }
}

class NumComparator2 implements Comparator<Map.Entry<Integer, Integer>>{

    @Override
    public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
        Integer feq1 = e1.getValue();
        Integer feq2 = e2.getValue();

        if(feq1 > feq2){
            return 1;
        }
        else if(feq1 < feq2){
            return -1;
        }
        else{
            return e2.getKey() - e1.getKey();
        }
    }
}
