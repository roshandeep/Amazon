import java.util.Arrays;

public class SortBinaryArrayInLinearTime {

    public void sort(int[] num) {
        int pivot=1;
        int start=0;

        for(int i=0;i<num.length;i++){
            if(num[i]<pivot){
                int temp=num[start];
                num[start]=num[i];
                num[i]=temp;
                start++;
            }
        }

    }

    public static void main(String[] args) {
        int[] num = {0, 0, 1, 0, 1, 1, 0, 1, 0, 0};
        SortBinaryArrayInLinearTime obj=new SortBinaryArrayInLinearTime();
        obj.sort(num);


        System.out.println(Arrays.toString(num));
    }
}
