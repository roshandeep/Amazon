import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationOfPhoneNumber {

    public List<String> letterCombinations(String digits) {

        HashMap<Character, char[]> hm=new HashMap<Character, char[]>();
        hm.put('2',new char[]{'a', 'b', 'c'});
        hm.put('3',new char[]{'d', 'e', 'f'});
        hm.put('4',new char[]{'g', 'h', 'i'});
        hm.put('5',new char[]{'j', 'k', 'l'});
        hm.put('6',new char[]{'m', 'n', 'o'});
        hm.put('7',new char[]{'p', 'q', 'r', 's'});
        hm.put('8',new char[]{'t', 'u', 'v'});
        hm.put('9',new char[]{'w', 'x', 'y', 'z'});

        List<String> res=new ArrayList<String>();
        char temp[]=new char[digits.length()];

        if(digits.length()==0){
            return res;
        }

        dfs(hm, res, temp, 0, digits);

        return res;
    }

    public void dfs(HashMap<Character, char[]> hm, List<String> res, char temp[], int index, String digits){

        if(index==digits.length()){
            res.add(new String(temp));
            return;
        }

        char num=digits.charAt(index);
        char combination[]=hm.get(num);
        for(int i=0;i<combination.length;i++){
            temp[index]=combination[i];
            dfs(hm, res, temp, index+1, digits);
        }
    }

    public static void main(String[] args) {
        LetterCombinationOfPhoneNumber obj=new LetterCombinationOfPhoneNumber();
        List<String> result = obj.letterCombinations("234");
        for (String res:result) {
            System.out.print(res + " ");
        }

    }
}
