import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> hs = new HashSet<Integer>();

        for(int num: nums){
            hs.add(num);
        }

        int lcs = 0;
        for(int num: nums){
            int prevNum = (num-1);
            if(hs.contains(prevNum)){
                continue;
            }
            else{
                int count = 0;
                while(hs.contains(num)){
                    count += 1;
                    num = num+1;
                }
                lcs = Math.max(lcs, count);
            }
        }
        return lcs;
    }

    public static void main(String[] args) {
        int arr[]={ 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(arr));
    }
}
