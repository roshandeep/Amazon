import java.util.Arrays;

public class InPlaceMergeTwoSortedArrays {
    public static void merge(int[] nums1, int[] nums2) {

        for (int i = nums2.length - 1; i >= 0; i--) {
            int j;
            int last = nums1[nums1.length - 1];

            for (j = nums1.length - 2; j > 0 && nums1[j] > nums2[i]; j--) {
                nums1[j + 1] = nums1[j];

                if (j != nums1.length - 2 || last > nums2[i]) {
                    nums1[j + 1] = nums2[i];
                    nums2[i] = last;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] X = {1, 5, 9, 10, 15, 20};
        int[] Y = {2, 3, 8, 13};

        merge(X, Y);

        System.out.println("X: " + Arrays.toString(X));
        System.out.println("Y: " + Arrays.toString(Y));
    }
}
