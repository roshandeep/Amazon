import java.util.Collections;
import java.util.HashSet;

public class Thirdmax {
    public int thirdMax(int[] nums) {

        if(nums.length<3){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }

        HashSet hs=new HashSet();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }

        if(hs.size() == 2){
            hs.remove(Collections.max(hs));
            int max3 = (int)Collections.max(hs);
            return max3;
        }

        if(hs.size() == 3){
            hs.remove(Collections.max(hs));
            hs.remove(Collections.max(hs));
            int max3 = (int)Collections.max(hs);
            return max3;
        }

        return 0;

    }
}
