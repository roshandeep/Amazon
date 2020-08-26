public class Digits {
    public static void main(String args[]) {

        int digits[] = {1,2,3};
        int carry = 0;

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] + carry + 1 <= 9) {
                digits[i] = digits[i] + 1;
                carry = 0;
            } else {
                if (i != 0) {
                    digits[i] = 0;
                    carry = 1;
                } else {
                    digits[i] = digits[i] + 1;
                }
            }
        }

        System.out.println(digits);
    }
}
