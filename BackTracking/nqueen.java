public class nqueen {
    public static boolean isSafe(char board[][],int row,int col){
        // vertical up
        for(int i=row-1;i>=0;i--){
            if (board[i][col]=='Q') {
                return false;
            }
        }
        // dig left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        // dig right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }
    public static boolean nQueen(char board[][],int row){
        for(int j=0;j<board.length;j++){
          if(row==board.length){
            return true;
          }
           if (isSafe(board,row,j)) {
               board[row][j]='Q';
               if (nQueen(board, row+1)) {
                 return true;
               }
               board[row][j]='X';
           }
        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("-----Chess-Board------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=7;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        if (nQueen(board, 0)) {
            System.out.println("nQueen is possible");
            printBoard(board);
        }else{
            System.out.print("nqueens is not possible");
        }
    }
    
}
