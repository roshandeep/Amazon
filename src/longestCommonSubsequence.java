public class longestCommonSubsequence {

    public static void main(String[] args) {
        String text1 = "AGGTAB";
        String text2 = "GXTXAYB";
        int len = lcsBottomUp(text1, text2, text1.length(), text2.length());
        System.out.println(len);
    }

    public static int lcsBottomUp(String s1, String s2, int l1, int l2){
        if(l1 == 0 || l2 == 0) {
            return 0;
        }
        int[][] arr = new int[l1 + 1][l2 + 1];
        for(int i = 1; i <= l1; i++) {
            for(int j = 1; j <= l2; j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    arr[i][j] = 1 + arr[i - 1][j - 1];
                }
                else {
                    arr[i][j] = Math.max(arr[i][j - 1], arr[i - 1][j]);
                }
            }
        }

        return arr[l1][l2];
    }
}
