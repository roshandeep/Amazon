public class GameOfLife {
    public void gameOfLife(int[][] board) {

        if(board==null || board.length==0){
            return;
        }
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==0){
                    int lifearound=count(board,i,j);
                    if(lifearound==3){
                        board[i][j]=-1;
                    }
                }
                else if(board[i][j]==1){
                    int lifearound=count(board,i,j);
                    if(lifearound<2 || lifearound>3){
                        board[i][j]=2;
                    }
                }
            }
        }
        updateboard(board);
    }

    public int count(int board[][], int row, int col){
        int rowdir[]={-1, -1, -1, 0, 1, 1, 1, 0};
        int coldir[]={-1, 0, 1, 1, 1, 0, -1, -1};
        int alive=0;
        for(int i=0;i<rowdir.length;i++){
            int newrow=row+rowdir[i];
            int newcol=col+coldir[i];
            if(newrow>=0 && newrow<board.length && newcol>=0 && newcol<board[0].length){
                if(board[newrow][newcol]==1 || board[newrow][newcol]==2){
                    alive=alive+1;
                }
            }
        }
        return alive;
    }

    public void updateboard(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 1;
                } else if (board[i][j] == 2) {
                    board[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        GameOfLife obj=new GameOfLife();
        int board[][]={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        obj.gameOfLife(board);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}

