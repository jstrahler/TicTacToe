
package tictactoe;


public class Board {
    
    public static void display(String[] board){
        
    }
    
    public static String[] reset(String[] board){
        for (int i = 0; i < 9; i++){
            board[i] = Integer.toString(i+1);
        }
        return board;
    }
    
}
