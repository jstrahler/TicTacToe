
package tictactoe;

import java.util.Scanner;
import java.util.*;

public class TicTacToe {

    public static String[] board = new String[9];
    public static String symbol = "X";
    public static int turn = 1;
    public static int turnCounter = 0;
    public static boolean winner = false;
    
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Tic-Tac-Toe!");
        
        while (true){
            System.out.println("How many players are playing, 1 or 2?");
            input = scan.nextLine().toLowerCase();
            
            if (input.equals("1")){
                Computer.difficulty();
                Board.reset(board);
                play(Integer.parseInt(input));
                //break;
            } else if (input.equals("2")){
                Board.reset(board);
                play(Integer.parseInt(input));
                //break;
            } else {
                System.out.println("\nPlease enter a valid number of players...\n");
            }
        }
    }
    
    public static void play(int players){
        Random rand = new Random();
        turn = (int)rand.nextInt(2)+1;
        
        if (turn == 2){
            flip();
        }
        
        if (players == 2){
            System.out.println("Player 1 will be X's\nPlayer 2 will be O's");
            System.out.println("The first turn will go to player " + turn);

            Board bf = new Board();
            
            
            
            while (bf.open == true);
            System.out.print("hi");
            bf.dispose();
            
            
            
            
            
            
            
            
            
            
            
            
        } else {
            System.out.println("Player 1 will be X's\nThe computer will be O's");
            if (turn == 1){
                System.out.println("You will go first!");
            } else {
                System.out.println("The computer will go first!");
            }
            
            while (true && turnCounter < 9){
                
                if (turn == 1){
                    
                } else {
                    board[Computer.compMove(board)] = "O";
                }

                checkWinConditions();
                turnCounter++;
                if (winner)
                    break;
            }
            
            if (turnCounter == 9){
                System.out.println("Sorry it is a draw");
            } else if (turn == 2)  {
                System.out.println("Sorry the computer won this time");
            } else if (turn == 1){
                System.out.println("YOU ARE THE WINNER!!!");
            }
            
            
        }

        
        
        
    }
    
    
    public static void checkWinConditions(){

        System.out.println(board[0] + board[1] + board[2] + board[3] + board[4] + board[5] + board[6] + board[7] + board[8]);
        System.out.println(turnCounter);
        
        
        if (board[0] == symbol && board[1] == symbol && board[2] == symbol){
            winner = true;
        } else if (board[3] == symbol && board[4] == symbol && board[5] == symbol){
            winner = true;
        } else if (board[6] == symbol && board[7] == symbol && board[8] == symbol){
            winner = true;
        } else if (board[0] == symbol && board[4] == symbol && board[8] == symbol){
            winner = true;
        } else if (board[2] == symbol && board[4] == symbol && board[6] == symbol){
            winner = true;
        } else if (board[0] == symbol && board[3] == symbol && board[6] == symbol){
            winner = true;
        } else if (board[1] == symbol && board[4] == symbol && board[7] == symbol){
            winner = true;
        } else if (board[2] == symbol && board[5] == symbol && board[8] == symbol){
            winner = true;
        } else {
            winner = false;
        }
        
        if (winner == true || turnCounter == 9)
            win();
        
        flip();
        
        return;
    }
    
    public static void flip(){
        if (turn == 1){
            turn = 2;
            symbol = "O";
        } else if (turn == 2){
            turn = 1;
            symbol = "X";
        }
    }
    
    public static void win(){
        if (turnCounter == 9){
                System.out.println("Sorry it is a draw");
            } else if (turn == 2)  {
                System.out.println("THE WINNER IS PLAYER 2");
            } else if (turn == 1){
                System.out.println("THE WINNER IS PLAYER 1");
            }
            
            
    }
    
}
