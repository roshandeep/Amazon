public class The_cake_is_not_a_lie {
    public int solution(String s){
        if(s.length() < 1){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }

        int ptr1=0, ptr2=1, ptr=1;

        while(ptr2 < s.length()) {
            while(s.charAt(ptr1) != s.charAt(ptr2)) {
                ptr2 = ptr2 + 1;
                if (ptr2 >= s.length()) {
                    return 1;
                }
            }

            if(s.length() % ptr2 == 0) {
                ptr = ptr2;
                while(ptr2<s.length() && s.charAt(ptr1) == s.charAt(ptr2)){
                    ptr1 = ptr1 + 1;
                    ptr2 = ptr2 + 1;
                }
                if (ptr2 >= s.length()) {
                    return ((int) s.length() / ptr);
                }
            }

            ptr1 = 0;
            ptr2 = ptr2 + 1;
        }

        return 1;
    }

    public static void main(String[] args) {
        The_cake_is_not_a_lie obj = new The_cake_is_not_a_lie();
        String s="abccbaabccba";
//        String s="aa";
//        String s="abcabc";
//        String s="abcabcabc";
//        String s="ababT";
        int res = obj.solution(s);
        System.out.print(res);
    }
}
