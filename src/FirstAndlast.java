public class FirstAndlast {
    public int[] searchRange(int[] nums, int target) {

        int res[]=new int[]{-1,-1};
        if(nums.length==0){
            return res;
        }
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                res[0]=mid;
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
        }
        start=0; end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                res[1]=mid;
                start=mid+1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
        FirstAndlast obj=new FirstAndlast();
        int res[]=obj.searchRange(nums, target);
        System.out.println(res[0]+" "+res[1]);
    }
}
