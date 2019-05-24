
package tictactoe;


public class Board {
    
    public static void display(String[] board){
        p(board[0] + " | " + board[1] + " | " + board[2]);
        p("-----------");
        p(board[3] + " | " + board[4] + " | " + board[5]);
        p("-----------");
        p(board[6] + " | " + board[7] + " | " + board[8]);
        return;
    }
    
    public static String[] reset(String[] board){
        for (int i = 0; i < 9; i++){
            board[i] = Integer.toString(i+1);
        }
        return board;
    }
    
    public static void p(String x){
        System.out.println(x);
        return;
    }
    
}


