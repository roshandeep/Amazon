import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortArrayByFrequencyOrIndex {

    public int[] frequencySort(int[] nums) {
        ArrayList<Element> al = new ArrayList<Element>();
        HashMap<Integer, Element> hm = new HashMap<Integer, Element>();
        int res[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.get(nums[i]).freq++;
            } else {
                hm.put(nums[i], new Element(nums[i], i, 1));
            }
        }

        for (Map.Entry<Integer, Element> entryset : hm.entrySet()) {
            al.add(entryset.getValue());

        }
        Collections.sort(al);

        int count = 0;
        for (int i = 0; i < al.size(); i++) {
            // System.out.println(al.get(i).freq + " " + al.get(i).val + " " + al.get(i).idx);
            for (int j = 0; j < al.get(i).freq; j++) {
                res[count++] = al.get(i).val;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        SortArrayByFrequencyOrIndex obj = new SortArrayByFrequencyOrIndex();
        int nums[] = {3, 3, 1, 1, 1, 8, 3, 6, 8, 7, 8};
        int arr[] = obj.frequencySort(nums);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

class Element implements Comparable<Element> {
    int val, idx, freq;

    public Element(int val, int idx, int freq) {
        this.val = val;
        this.idx = idx;
        this.freq = freq;
    }

    public int compareTo(Element obj) {
        if (this.freq > obj.freq) {
            return 1;
        } else if (this.freq < obj.freq) {
            return -1;
        } else if (this.freq == obj.freq) {
            return this.idx - obj.idx;
        }
        return this.idx - obj.idx;
    }
}
