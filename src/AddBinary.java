public class AddBinary {
    public String addBinary(String a, String b) {

        String num1="",num2="";
        if(a.length()>b.length()){
            num1=a;
            num2=b;
        }
        else{
            num1=b;
            num2=a;
        }

        String carry="0";
        String sum="";
        for(int i=0;i<num2.length();i++){
            char c1=num1.charAt(num1.length()-1-i);
            char c2=num2.charAt(num2.length()-1-i);
            if(c1=='1' && c2=='1' && carry=="1"){
                carry="1";
                sum="1"+sum;
            }
            else
            if((c1=='1' && c2=='1' && carry=="0") || (c1=='1' && c2=='0' && carry=="1") || (c1=='0' && c2=='1' && carry=="1")){
                carry="1";
                sum="0"+sum;
            }
            else
            if((c1=='0' && c2=='1' && carry=="0") || (c1=='1' && c2=='0' && carry=="0") || (c1=='0' && c2=='0' && carry=="1")){
                carry="0";
                sum="1"+sum;
            }
            else
                if(c1=='0' && c2=='0' && carry=="0"){
                    carry="0";
                    sum="0"+sum;
                }
        }

        for(int i=(num1.length()-num2.length())-1;i>=0;i--){
            char c1=num1.charAt(i);
            if(c1=='1' && carry=="1"){
                carry="1";
                sum="0"+sum;
            }
            else
            if((c1=='1'&& carry=="0") || (c1=='0' && carry=="1")){
                carry="0";
                sum="1"+sum;
            }
            else
                if(c1=='0' && carry=="0"){
                    carry="0";
                    sum="0"+sum;
                }
        }

        if(carry=="1"){
            sum=carry+sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        AddBinary obj=new AddBinary();
        String a="110010";
        String b="100";
        String s=obj.addBinary(a,b);
        System.out.print(s);
    }
}
