import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DiagonalTraverse2 {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int size=0;
        HashMap<Integer, ArrayList<Integer>> hm=new HashMap<>();
        for(int i=nums.size()-1;i>=0;i--){
            for(int j=0;j<nums.get(i).size();j++){
                if(hm.containsKey(i+j)){
                    hm.get(i+j).add(nums.get(i).get(j));
                }
                else{
                    hm.put(i+j, new ArrayList<>());
                    hm.get(i+j).add(nums.get(i).get(j));
                }
                size++;
            }
        }
        int diagonal[]=new int[size];
        int k=0;
        for(List<Integer> numList : hm.values()) {
            for(int num : numList) {
                diagonal[k++]=num;
            }
        }

        return diagonal;
    }

    public static void main(String[] args) {
        DiagonalTraverse2 obj=new DiagonalTraverse2();
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
        nums.add(new ArrayList<Integer>(Arrays.asList(6, 7)));
        nums.add(new ArrayList<Integer>(Arrays.asList(8)));
        nums.add(new ArrayList<Integer>(Arrays.asList(9, 10, 11)));
        nums.add(new ArrayList<Integer>(Arrays.asList(12, 13, 14, 15, 16)));
        int res[] = obj.findDiagonalOrder(nums);
        for (int num: res) {
            System.out.print(num + " ");
        }
    }
}
