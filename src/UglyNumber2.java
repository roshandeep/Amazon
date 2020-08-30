import java.util.ArrayList;
import java.util.List;

public class UglyNumber2 {
    public int nthUglyNumber(int n) {
        if(n==0){
            return 0;
        }

        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        int twoptr=0, threeptr=0, fiveptr=0;
        int val2=2, val3=3, val5=5;
        for(int i=1;i<n;i++){
            int min=Math.min(val2, Math.min(val3,val5));
            list.add(min);
            if(min==val2){
                twoptr++;
                val2=2*list.get(twoptr);
            }
            if(min==val3){
                threeptr++;
                val3=3*list.get(threeptr);
            }
            if(min==val5){
                fiveptr++;
                val5=5*list.get(fiveptr);
            }

        }
        return(list.get(list.size()-1));
    }

    public static void main(String[] args) {
        UglyNumber2 obj=new UglyNumber2();
        System.out.println(obj.nthUglyNumber(100));
    }
}
