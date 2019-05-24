
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
                play(Integer.parseInt(input));
                break;
            } else if (input.equals("2")){
                play(Integer.parseInt(input));
                break;
            } else {
                System.out.println("\nPlease enter a valid number of players...\n");
            }
        }
    }
    
    
    
    
    public static void play(int players){
        boolean winner = false;
        Random rand = new Random();
        int turn = (int)rand.nextInt(2)+1;
        
        System.out.println("The first turn will go to player " + turn);
        
        
        while (!winner){
            turn(turn);
            if (turn == 1){
                turn = 0;
            } else {
                turn = 1;
            }
            
            
            
        }
        
        

    }
    
    
    
    
    public static void turn(int player){
        Scanner scan = new Scanner(System.in);
        
        
    }
    
    
}
