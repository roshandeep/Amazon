public class TraverseDiagonally {
    public int[] findDiagonalOrder(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int[] diagonal = new int[row * col];
        boolean upmove=true;
        int rowindex=0,colindex=0;
        for(int i=0;i<row*col;i++){
            diagonal[i]=matrix[rowindex][colindex];
            if(upmove){
                if(colindex+1>=col){
                    upmove=false;
                    rowindex++;
                }
                else if(rowindex-1<0){
                    upmove=false;
                    colindex++;
                }
                else{
                    rowindex--;
                    colindex++;
                }
            }
            else{
                if(rowindex+1>=row){
                    upmove=true;
                    colindex++;
                }
                else if(colindex-1<0){
                    upmove=true;
                    rowindex++;
                }
                else{
                    rowindex++;
                    colindex--;
                }
            }
        }

        return diagonal;
    }

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        TraverseDiagonally obj=new TraverseDiagonally();
        int diagonal[] = obj.findDiagonalOrder(arr);
        for (int i=0;i<diagonal.length;i++){
            System.out.print(diagonal[i] + " ");
        }
    }
}
