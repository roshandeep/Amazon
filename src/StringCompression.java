public class StringCompression {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }

        int i=0,j=0,pos=0;
        while(i<chars.length){
            int count=1;
            j=i+1;
            while(j<chars.length && chars[i]==chars[j]){
                count++;
                j++;
            }

            if(count>1){
                String charcount = String.valueOf(count);
                chars[pos++]=chars[i];
                for(int k=0;k<charcount.length();k++) {
                    chars[pos++] = charcount.charAt(k);
                }
            }
            else if(count==1){
                chars[pos++]=chars[i];
            }
            i=j;
        }

        return pos;
    }

    public static void main(String[] args) {
        StringCompression obj=new StringCompression();
        //char chars[]={'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c'};
        //char chars[]={'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        char chars[]={'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        int res = obj.compress(chars);

        for(int i=0;i<res;i++){
            System.out.print(chars[i]+" ");
        }
    }
}
