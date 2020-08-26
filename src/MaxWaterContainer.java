public class MaxWaterContainer {
    public int maxArea(int[] height) {

        int l=0, r=height.length-1;
        int water=0, maxwater=Integer.MIN_VALUE;
        while(l<=r){
            water=(r-l)*Math.min(height[l],height[r]);
            maxwater=Math.max(maxwater,water);
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        MaxWaterContainer obj=new MaxWaterContainer();
        System.out.println(obj.maxArea(height));
    }
}
