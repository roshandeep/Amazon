public class TraverseDiagonally {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int row = matrix.length;
        int column = matrix[0].length;
        int[] diagonal = new int[row * column];

        return diagonal;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3,4},
                        {8, 9, 10, 5},
                        {15, 16, 17, 6}};
        TraverseDiagonally obj=new TraverseDiagonally();
        int diagonal[] = obj.findDiagonalOrder(arr);
        for (int i=0;i<diagonal.length;i++){
            System.out.println(diagonal[i] + " ");
        }
    }
}

//    public int[] findDiagonalOrder(int[][] matrix) {
//        if (matrix.length == 0) {
//            return new int[0];
//        }
//        int row = matrix.length;
//        int column = matrix[0].length;
//        int[] result = new int[row * column];
//        int x = 0;
//        int currRow = 0, currCol = 0;
//        boolean up = true; // otherwise, it's down
//        while (x != (row * column)) {
//            result[x++] = matrix[currRow][currCol];
//            if (up) {
//                if (currCol + 1 >= column) {
//                    up = false;
//                    currRow++;
//                } else if (currRow - 1 < 0) {
//                    up = false;
//                    currCol++;
//                } else {
//                    currRow--;
//                    currCol++;
//                }
//            } else {
//                if (currRow + 1 >= row) {
//                    up = true;
//                    currCol++;
//                } else if (currCol - 1 < 0) {
//                    up = true;
//                    currRow++;
//                } else {
//                    currRow++;
//                    currCol--;
//                }
//            }
//        }
//        return result;
//    }