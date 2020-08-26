import java.util.Arrays;

public class DecompressList {
    public int[] decompressRLElist(int[] nums) {

        int sublist[]=new int[10000];
        int count=0;
        for(int i=0;i<nums.length;i=i+2){
            for(int j=1;j<=nums[i];j++){
                sublist[count]=nums[i+1];
                count++;
            }
        }

        return  Arrays.copyOfRange(sublist, 0, count);
    }

    public static void main(String[] args) {
        DecompressList obj=new DecompressList();
        int nums[]={1,2,3,4};
        int res[] = obj.decompressRLElist(nums);
    }
}
