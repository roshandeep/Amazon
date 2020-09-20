import java.util.Arrays;

public class TwoSumAndTarget2 {
    public int[] twoSum(int[] numbers, int target) {

        int l=0, r=numbers.length-1;
        int index[]=new int[2];

        Arrays.sort(numbers);
        while(l!=r){
            if(numbers[l]+numbers[r] == target){
                index[0]=l+1;
                index[1]=r+1;
                return index;
            }
            else
            if(numbers[l]+numbers[r] > target){
                r--;
            }
            else
            if(numbers[l]+numbers[r] < target){
                l++;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        TwoSumAndTarget2 obj=new TwoSumAndTarget2();
        int nums[] = {2,7,11,15};
        int target = 9;
        int ans[] = obj.twoSum(nums, target);
        System.out.print(ans[0] + " " +ans[1]);
    }
}
