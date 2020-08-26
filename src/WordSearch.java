public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean result = false;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(dfs(board,word,i,j,0)){
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean dfs(char[][] board,  String word, int i, int j, int count){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length){
            return false;
        }

        if(board[i][j] == word.charAt(count)){
            char temp = board[i][j];
            board[i][j]='#';
            if(count==word.length()-1){
                return true;
            }else if(dfs(board, word, i-1, j, count+1)
                    ||dfs(board, word, i+1, j, count+1)
                    ||dfs(board, word, i, j-1, count+1)
                    ||dfs(board, word, i, j+1, count+1)){
                return true;
            }
            board[i][j]=temp;
        }

        return false;
    }

    public static void main(String[] args) {
        WordSearch obj=new WordSearch();
        char board[][] = {
                            {'A','B','C','E'},
                            {'S','F','C','S'},
                            {'A','D','E','E'}
                        };

        System.out.println(obj.exist(board, "ABCCED"));
        System.out.println(obj.exist(board, "SEE"));
        System.out.println(obj.exist(board, "ABCB"));
    }
}
