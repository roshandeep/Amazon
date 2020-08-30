public class UniquePath1and2 {
    public int uniquePaths(int m, int n) {
        int sol[][]=new int[m][n];
        for(int i=0;i<m;i++){
            sol[i][0]=1;
        }
        for(int i=0;i<n;i++){
            sol[0][i]=1;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                sol[i][j]=sol[i-1][j]+sol[i][j-1];
            }
        }

        return sol[m-1][n-1];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int r=obstacleGrid.length;
        int c=obstacleGrid[0].length;
        int sol[][]=new int[r][c];

        if(obstacleGrid[0][0]==1 || obstacleGrid[r-1][c-1]==1){
            return 0;
        }
        sol[0][0]=1;
        for(int i=1;i<r;i++){
            if(obstacleGrid[i][0]==1){
                sol[i][0]=0;
            }
            else{
                sol[i][0]=sol[i-1][0];
            }
        }
        for(int i=1;i<c;i++){
            if(obstacleGrid[0][i]==1){
                sol[0][i]=0;
            }
            else{
                sol[0][i]=sol[0][i-1];
            }
        }

        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(obstacleGrid[i][j]==1){
                    sol[i][j]=0;
                }
                else{
                    sol[i][j]=sol[i-1][j]+sol[i][j-1];
                }
            }
        }

        return sol[r-1][c-1];
    }

    public static void main(String[] args) {
        UniquePath1and2 obj=new UniquePath1and2();

        System.out.println(obj.uniquePaths(6,2));

        int obstacleGrid[][]= {
                            {0, 0, 0},
                            {0, 1, 0},
                            {0, 0, 0}
                        };
        System.out.println(obj.uniquePathsWithObstacles(obstacleGrid));
    }
}
