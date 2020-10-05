public class MinimumSwapsToMakeStringsEqual {
    public int minimumSwap(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return -1;
        }

        int swap1=0, swap2=0;
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2){
                if(ch1=='x' && ch2=='y'){
                    swap1++;
                }
                else if(ch1=='y' && ch2=='x'){
                    swap2++;
                }
            }
        }
        if((swap1+swap2)%2!=0){
            return -1;
        }
        if(swap1%2==0 && swap2%2==0){
            return (swap1+swap2)/2;
        }
        else{
            return 2+(swap1/2 + swap2/2);
        }
    }

    public static void main(String[] args) {
        MinimumSwapsToMakeStringsEqual obj=new MinimumSwapsToMakeStringsEqual();
        System.out.println(obj.minimumSwap("xx","yy"));
        System.out.println(obj.minimumSwap("xy","yx"));
        System.out.println(obj.minimumSwap("xxyyxyxyxx","xyyxyxxxyx"));
    }
}
