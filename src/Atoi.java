public class Atoi {
    public static int myAtoi(String str) {

        str=str.trim();
        if(str.length()==0)
            return 0;

        char ch=str.charAt(0);
        double atoi=0;
        int sign=0;
        int i=0;

        if(ch=='-'){
            sign=-1;
            i++;
        }
        else if(ch=='+'){
            sign=1;
            i++;
        }


        while(i<str.length()){
            char num=str.charAt(i);

            if(num>='0' && num <='9'){
                atoi=atoi*10 + (num-'0');
            }
            else{
                break;
            }
            i++;
        }


        if (sign==-1)
            atoi = -atoi;

        if (atoi > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if (atoi < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) atoi;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
    }
}
