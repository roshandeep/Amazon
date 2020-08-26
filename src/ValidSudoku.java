import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character> hs=new HashSet<Character>();

        for(int i=0;i<board.length;i++){
            hs.clear();

            for(int j=0;j<board[i].length;j++){
                if(hs.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                else if(!hs.contains(board[i][j]) && board[i][j]!='.'){
                    hs.add(board[i][j]);
                }
            }

            hs.clear();
            for(int j=0;j<board[i].length;j++){
                if(hs.contains(board[j][i]) && board[j][i]!='.'){
                    return false;
                }
                else if(!hs.contains(board[j][i]) && board[j][i]!='.'){
                    hs.add(board[j][i]);
                }
            }

            hs.clear();
            int k = i/3*3, l = i%3*3;
            for(int j=0;j<board[i].length;j++){

                char ch = board[k + j/3][l + j%3];
                if(hs.contains(ch) && ch!='.'){
                    return false;
                }
                else if(!hs.contains(ch) && ch!='.'){
                    hs.add(ch);
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {
        char sudoku[][]=    {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
            };
        ValidSudoku obj=new ValidSudoku();
        boolean valid= obj.isValidSudoku(sudoku);
        System.out.print(valid);
        System.out.println();
        for(int i=0;i<9;i++){
            System.out.print(i/3*3 + " " +  i%3*3);
            System.out.println();
        }
    }
    

}
