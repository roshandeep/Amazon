public class perfectSq {
    public static void main(String[] args) {
        int num=808201;
        int left=2, right=num/2;
        int mid=0;

        if(num < 2) System.out.println(true);

        while(left<=right){
            mid=left+(right-left)/2;

            if(mid*mid>num){
                right=mid-1;
            }
            else
            if(mid*mid<num){
                left=mid+1;
            }
            else
            if(mid*mid==num){
                System.out.println(true);
            }
        }
        System.out.println(false);
    }
}
