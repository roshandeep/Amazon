import java.util.HashMap;
import java.util.Map;

public class numbers_station_coded_messages {
    public static int[] solution(int[] l, int t) {
        int[] rets = {-1, -1};
        int sum=0;
        for (int i=0; i<l.length; i++) {
            sum=0;
            for (int j=i; j<l.length; j++) {
                sum+=l[j];
                if (sum > t) break;
                if (sum == t) {
                    rets[0] = i;
                    rets[1] = j;
                    return rets;
                }
            }
        }
        return rets;
    }

    public static boolean solution2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum % k)) {
                if( i - map.get(sum % k) >= 2) {
                    return true;
                }
            } else {
                map.put(sum % k, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        numbers_station_coded_messages obj = new numbers_station_coded_messages();

//        int res[] = obj.solution(new int[]{4, 3, 5, 7, 8}, 12);
//       int res[] = obj.solution(new int[]{4, 3, 10, 2, 8}, 12);
        int res[] = obj.solution(new int[]{1, 2, 3, 4}, 15);
        System.out.print(res[0] + "" + res[1]);

        boolean check = obj.solution2(new int[]{4, 3, 10, 2, 8}, 12);
    }

}
