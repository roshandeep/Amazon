public class HappyString1 {
    static void generateString(int A, int B)
    {
        String rt = "";
        while (0 < A || 0 < B){
            if (A < B){
                if (0 < B--){
                    rt += ('b');
                }
                if (0 < B--){
                    rt += ('b');
                }
                if (0 < A--){
                    rt += ('a');
                }
            }

            else if (B < A){
                if (0 < A--){
                    rt += ('a');
                }
                if (0 < A--){
                    rt += ('a');
                }
                if (0 < B--){
                    rt += ('b');
                }
            }

            else{
                if (0 < A--){
                    rt += ('a');
                }
                if (0 < B--){
                    rt += ('b');
                }
            }
        }
        System.out.println(rt);
    }
    public static void main(String[] args){
        int A = 40, B = 3;
        generateString(A, B);
//        If occurrence(a) > occurrence(b) then append “aab”
//        If occurrence(b) > occurrence(a) then append “bba”
//        If occurrence(a) = occurrence(b) then append “ab”
    }
}
