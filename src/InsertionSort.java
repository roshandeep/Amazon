public class InsertionSort {

    public void insertionSort(int nums[]){

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
