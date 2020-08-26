public class RotateArray {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        for(int i=1;i<=k;i++){
            int temp=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 7};
        RotateArray obj=new RotateArray();
        obj.rotate(arr, 3);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
