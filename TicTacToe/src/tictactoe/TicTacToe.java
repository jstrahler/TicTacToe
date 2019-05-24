
package tictactoe;

import java.util.Scanner;
import java.util.*;

public class TicTacToe {

    public static String[] board = new String[9];
    
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
        boolean winner = false;
        Random rand = new Random();
        int turn = (int)rand.nextInt(2)+1;
        int turnCounter = 0;
        
        if (players == 2){
            System.out.println("Player 1 will be X's\nPlayer 2 will be O's");
            System.out.println("The first turn will go to player " + turn);
        
        
            while (true && turnCounter < 9){
                turn(turn);
                winner = checkWinConditions(turn);
                turnCounter++;
                if (winner)
                    break;
                if (turn == 1){
                    turn = 2;
                } else {
                    turn = 1;
                }
            }
            
            System.out.println("THE WINNER IS PLAYER " +  turn);
            
            if (turnCounter == 9){
                System.out.println("Sorry it is a draw");
            } else if (turn == 2)  {
                System.out.println("THE WINNER IS PLAYER 2");
            } else if (turn == 1){
                System.out.println("THE WINNER IS PLAYER 1");
            }
            
        } else {
            System.out.println("Player 1 will be X's\nThe computer will be O's");
            if (turn == 1){
                System.out.println("You will go first!");
            } else {
                System.out.println("The computer will go first!");
            }
            
            while (true && turnCounter < 9){
                
                if (turn == 1){
                    turn(turn);
                } else {
                    board[Computer.compMove(board)] = "O";
                }

                winner = checkWinConditions(turn);
                turnCounter++;
                if (winner)
                    break;
                if (turn == 1){
                    turn = 2;
                } else {
                    turn = 1;
                }
            }
            
            if (turnCounter == 9){
                System.out.println("Sorry it is a draw");
            } else if (turn == 2)  {
                System.out.println("Sorry the computer won this time");
            } else if (turn == 1){
                System.out.println("YOU ARE THE WINNER!!!");
            }
            
            
        }

        
        
        return;
    }
    
    public static void turn(int player){
        Scanner scan = new Scanner(System.in);
        String input;
        String symbol;
        
        if (player == 1){
            symbol = "X";
        } else {
            symbol = "O";
        }
        
        while (true){
            Board.display(board);
            System.out.println("It is Player " + player + " turn. Where would you like to go? ");
            input = scan.nextLine().toLowerCase();
        
            label: try{
                if (Integer.parseInt(input) > 0 && Integer.parseInt(input) < 10){
                    if (board[Integer.parseInt(input) - 1] == "X" || board[Integer.parseInt(input) - 1] == "O"){
                        System.out.println("There is already an X or O there...");
                        break label;
                    }
                    board[Integer.parseInt(input) - 1] = symbol;
                    break;

                } 
            } catch(Exception e) {
                System.out.println("Please enter a valid number on the grid...");
            }
        }
        
        return;
        
        
        
    }
    
    
    public static boolean checkWinConditions(int turn){
        boolean winner = false;
        String symbol;
        if (turn == 1){
            symbol = "X";
        } else {
            symbol = "O";
        }
            
        
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
        return winner;
    }
    
    
    
}
