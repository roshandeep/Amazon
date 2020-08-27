public class WiggleSort {

//      1) Traverse all even positioned elements of input array, and do following.
//      a) If current element is smaller than previous odd element, swap previous and current.
//      b) If current element is smaller than next odd element, swap next and current.
    public void wiggleSort(int nums[]){

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]<nums[i-1]){
                swap(nums, i, i-1);
            }
            if(i<nums.length-1 && nums[i]<nums[i+1]){
                swap(nums, i, i+1);
            }
        }
    }

    public void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        WiggleSort obj=new WiggleSort();
        int nums[]={10, 5, 6, 2, 20, 3, 100, 80};
        obj.wiggleSort(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
