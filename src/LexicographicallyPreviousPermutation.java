public class LexicographicallyPreviousPermutation {
    public int[] prevPermOpt1(int[] A) {
        int index=-1;
        for(int i=A.length-1;i>0;i--){
            if(A[i-1]>A[i]){
                index=i-1;
                break;
            }
        }
        if(index==-1){
            return A;
        }

        int secindex=index+1;
        for(int i=index+1;i<A.length-1;i++){
            if(A[i+1]<A[index] && A[i+1]>A[i]){
                secindex=i+1;
            }
        }

        int temp=A[index];
        A[index]=A[secindex];
        A[secindex]=temp;

        return A;
    }

    public static void main(String[] args) {
        LexicographicallyPreviousPermutation obj=new LexicographicallyPreviousPermutation();
        //int num[]={1, 7, 3, 4, 5};
        //int num[]={1, 2, 3, 4, 5};
        int num[]={4, 2, 5, 6};
        obj.prevPermOpt1(num);
        for(int i: num){
            System.out.print(i);
        }
        System.out.println();
    }
}
