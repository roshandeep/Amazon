public class Zigzag {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }

        String newstr="";
        String arr[][]=new String[numRows][s.length()];

        int row=0; boolean down=true;
        for(int i=0;i<s.length();i++){
            arr[row][i]=Character.toString(s.charAt(i));
            if(down){
                row++;
            }
            else{
                row--;
            }

            if(row==numRows-1){
                down=false;
            }
            else if(row==0){
                down=true;
            }
        }

        for(int i=0;i<numRows;i++){
            for(int j=0;j<s.length();j++){
                if(arr[i][j]!=null){
                    newstr=newstr+arr[i][j];
                }
            }
        }

        return newstr;
    }

    public static void main(String[] args) {
        Zigzag obj=new Zigzag();
        obj.convert("PAYPALISHIRING",3);
    }
}
