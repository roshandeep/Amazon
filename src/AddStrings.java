public class AddStrings {
    public String addStrings(String num1, String num2) {

        StringBuilder sum=new StringBuilder();
        int l1=num1.length()-1, l2=num2.length()-1;
        int carry=0;
        char ch1='0', ch2='0';
        while(l1>=0 || l2>=0){
            if(l1>=0){
                ch1=num1.charAt(l1);
            }
            else{
                ch1='0';
            }
            if(l2>=0){
                ch2=num2.charAt(l2);
            }
            else{
                ch2='0';
            }
            int s=(ch1-'0')+(ch2-'0')+carry;
            carry=s/10;
            sum.insert(0, s%10);
            l1--;
            l2--;
        }
        if(carry>0){
            sum.insert(0, carry);
        }
        return sum.toString();
    }

    public static void main(String[] args) {
        AddStrings obj=new AddStrings();
        System.out.println(obj.addStrings("24","234"));
    }
}
