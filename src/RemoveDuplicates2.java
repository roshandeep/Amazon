public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums==null){
            return 0;
        }

        int i=2;
        for(int j=2;j<nums.length;j++){
            if(nums[i-2]!=nums[j]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicates2 obj=new RemoveDuplicates2();
        int nums[]={0,0,0,0,1,1,1,1,2,3,3};
        int len = obj.removeDuplicates(nums);

        for (int i=0;i<len;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
