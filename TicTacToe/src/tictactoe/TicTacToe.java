
package tictactoe;

import java.util.Scanner;

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
                
                break;
            } else if (input.equals("2")){
                break;
            } else {
                System.out.println("\nPlease enter a valid number of players...\n");
            }
        }
    }
    
}
