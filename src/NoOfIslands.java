public class NoOfIslands {
    public int numIslands(char[][] grid) {

        if(grid==null || grid.length==0){
            return 0;
        }

        int count=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    int island = getIsland(grid, i, j);
                    count=count+island;
                }
            }
        }

        return count;
    }

    public int getIsland(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'){
            return 0;
        }

        grid[i][j]='0';
        getIsland(grid, i+1, j);
        getIsland(grid, i-1, j);
        getIsland(grid, i, j+1);
        getIsland(grid, i, j-1);

        return 1;
    }

    public static void main(String[] args) {
        NoOfIslands obj=new NoOfIslands();
        char grid[][] = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
                        };
        int count = obj.numIslands(grid);
        System.out.println(count);
    }
}
