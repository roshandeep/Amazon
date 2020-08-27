public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int counter=0,i=0;
        while(counter<nums.length){
            if(nums[counter]==val){
                counter++;
            }
            else{
                nums[i]=nums[counter];
                i++;
                counter++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveElement obj=new RemoveElement();
        int nums[]={3,2,2,3};
        //int nums[]={0,1,2,2,3,0,4,2};
        int len = obj.removeElement(nums, 3);

        for (int i=0;i<len;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
