public class ExcelSheetNumber {
    public int titleToNumber(String s) {

        int num=0;
        int k=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int m=(int)ch-64;
            num=num+(int)(Math.pow(26,k)*m);
            k++;
        }

        return num;
    }

    public String convertToTitle(int n) {
        String title="";
        while(n>0){
            int d=(n%26)+64;
            if(n%26==0){
                n--;
                d=90;
            }
            title= (char)d + title;
            n=n/26;
        }
        return title;
    }

    public static void main(String[] args) {
        ExcelSheetNumber obj=new ExcelSheetNumber();
        System.out.println(obj.titleToNumber("ZXRF"));
        System.out.println(obj.convertToTitle(57));
    }
}
