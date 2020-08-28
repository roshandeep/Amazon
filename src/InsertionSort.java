public class InsertionSort {

    public void insertionSort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int j=i-1;
            int key=nums[i];
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                --j;
            }
            nums[j+1]=key;
        }
    }

    public static void main(String[] args) {
        InsertionSort obj=new InsertionSort();
        int nums[]={3,8,2,9,5,7,1,6,20,8};
        obj.insertionSort(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
