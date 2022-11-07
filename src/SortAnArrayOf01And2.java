import java.util.Arrays;

public class SortAnArrayOf01And2 {
    private static void threeWayPartition(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int pivot=1;

        while(mid<=end){
            if(nums[mid]<pivot){
                swap(nums, start, mid);
                start++;
                mid++;
            }
            else if(nums[mid]>pivot){
                swap(nums, mid, end);
                end--;
            }
            else{
                mid++;
            }
        }
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};

        threeWayPartition(A);
        System.out.println(Arrays.toString(A));
    }


}
