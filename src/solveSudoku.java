import java.util.HashSet;

public class solveSudoku {
    public void solveSudoku(char[][] board) {

        solver(board);
    }

    public boolean solver(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    continue;
                }

                for(char k='1';k<='9';k++){
                    board[i][j]=k;
                    if(isValid(board,i,j) && solver(board)){
                        return true;
                    }
                    board[i][j]='.';
                }
                return false;
            }
        }
        return true;
    }

    public boolean isValid(char[][] board, int i, int j){
        HashSet<Character> hs=new HashSet<Character>();

        for(int k=0;k<9;k++){
            if(hs.contains(board[i][k])){
                return false;
            }
            else
            if(board[i][k]!='.'){
                hs.add(board[i][k]);
            }
        }
        hs.clear();

        for(int k=0;k<9;k++){
            if(hs.contains(board[k][j])){
                return false;
            }
            else
            if(board[k][j]!='.'){
                hs.add(board[k][j]);
            }
        }

        hs.clear();

        int m=i/3*3;
        int n=j/3*3;
        for(int k=m;k<m+3;k++){
            for(int l=n;l<n+3;l++){
                if(hs.contains(board[k][l])){
                    return false;
                }
                else
                if(board[k][l]!='.'){
                    hs.add(board[k][l]);
                }
            }
        }
        hs.clear();
        return true;
    }

    public static void main(String[] args) {
        solveSudoku obj=new solveSudoku();
        char board[][]={{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};
        obj.solveSudoku(board);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
