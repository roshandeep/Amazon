public class RemoveDuplicates2 {
    public int removeDuplicates1(int[] nums) {
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

    public int removeDuplicates2(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                continue;
            }
            else
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        RemoveDuplicates2 obj=new RemoveDuplicates2();
        int nums[]={0,0,0,0,1,1,1,1,2,3,3};
        int len = obj.removeDuplicates1(nums);

        for (int i=0;i<len;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        int nums2[]={0,0,1,1,1,2,2,3,3,4};
        int len2 = obj.removeDuplicates2(nums2);

        for (int i=0;i<len2;i++){
            System.out.print(nums2[i]+" ");
        }
    }
}
