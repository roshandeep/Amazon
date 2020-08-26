import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> spiral=new ArrayList<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0,right=n-1,top=0,bottom=m-1;
        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                spiral.add(matrix[top][j]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                spiral.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom) {
                for (int j = right; j >= left; j--) {
                    spiral.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right) {
                for (int j = bottom; j >= top; j--) {
                    spiral.add(matrix[j][left]);
                }
                left++;
            }
        }

        return spiral;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}};

        /*int arr[][] = {{2,5,8},{4,0,-1}};*/

        SpiralMatrix obj=new SpiralMatrix();
        List<Integer> list = obj.spiralOrder(arr);
        for (Integer num: list){
            System.out.print(num + " ");
        }
    }
}
