public class MinimumSumPath {
    public int minPathSum(int[][] grid) {
        return dfs(grid,0,0);
    }

    public int minPathSum_DP(int[][] grid){
        if(grid == null || grid.length==0)
            return 0;

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];


        for(int i=1; i<n; i++){
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }

        for(int j=1; j<m; j++){
            dp[j][0] = dp[j-1][0] + grid[j][0];
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(dp[i-1][j] > dp[i][j-1]){
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                }else{
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[m-1][n-1];
    }
    
    public int dfs(int grid[][], int i, int j){

        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }

        if(i<grid.length-1 && j<grid[0].length-1){
            int sum1=grid[i][j]+dfs(grid,i+1,j);
            int sum2=grid[i][j]+dfs(grid,i,j+1);
            return Math.min(sum1,sum2);
        }

        if(i<grid.length-1){
            return grid[i][j]+dfs(grid,i+1,j);
        }

        if(j<grid[0].length-1){
            return grid[i][j]+dfs(grid,i,j+1);
        }

        return 0;
    }

    public static void main(String[] args) {
        int grid[][]={
                {3,8,6,0,5,9,9,6,3,4,0,5,7,3,9,3},
                {0,9,2,5,5,4,9,1,4,6,9,5,6,7,3,2},
                {8,2,2,3,3,3,1,6,9,1,1,6,6,2,1,9},
                {1,3,6,9,9,5,0,3,4,9,1,0,9,6,2,7},
                {8,6,2,2,1,3,0,0,7,2,7,5,4,8,4,8},
                {4,1,9,5,8,9,9,2,0,2,5,1,8,7,0,9},
                {6,2,1,7,8,1,8,5,5,7,0,2,5,7,2,1},
                {8,1,7,6,2,8,1,2,2,6,4,0,5,4,1,3},
                {9,2,1,7,6,1,4,3,8,6,5,5,3,9,7,3},
                {0,6,0,2,4,3,7,6,1,3,8,6,9,0,0,8},
                {4,3,7,2,4,3,6,4,0,3,9,5,3,6,9,3},
                {2,1,8,8,4,5,6,5,8,7,3,7,7,5,8,3},
                {0,7,6,6,1,2,0,3,5,0,8,0,8,7,4,3},
                {0,4,3,4,9,0,1,9,7,7,8,6,4,6,9,5},
                {6,5,1,9,9,2,2,7,4,2,7,2,2,3,7,2},
                {7,1,9,6,1,2,7,0,9,6,6,4,4,5,1,0},
                {3,4,9,2,8,3,1,2,6,9,7,0,2,4,2,0},
                {5,1,8,8,4,6,8,5,2,4,1,6,2,2,9,7}};

        MinimumSumPath obj=new MinimumSumPath();
        //int resursion = obj.minPathSum(grid);
        int dp=obj.minPathSum_DP(grid);
    }
}


