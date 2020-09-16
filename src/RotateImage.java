public class RotateImage {
    public void rotate(int[][] matrix) {
        int row=matrix.length;

        //Transpose
        for(int i=0;i<row;i++){
            for(int j=i;j<row;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //Switch Columns
        int start=0, end=matrix.length-1;
        while(start<end){
            for(int i=0;i<row;i++){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
            }
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int matrix[][]=new int[4][4];
        int count=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j]=count;
                count++;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        RotateImage obj=new RotateImage();
        obj.rotate(matrix);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
