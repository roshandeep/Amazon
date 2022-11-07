public class PascalTriangle {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int k = 10; k > i; k--) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
