import java.util.HashMap;

public class IsomorphicString {

    public Boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (hm1.containsKey(ch1)) {
                if (ch2 != hm1.get(ch1)) {
                    return false;
                }
            } else {
                if (hm2.containsKey(ch2)) {
                    return false;
                }
                hm1.put(ch1, ch2);
                hm2.put(ch2, ch1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "zoo", str2 = "add";
        IsomorphicString obj = new IsomorphicString();
        Boolean res = obj.isIsomorphic(str1, str2);
        System.out.println(res);
    }

}
