
package tictactoe;

import java.util.Scanner;
import java.util.*;

public class Computer {
    
    
    static int diff;
    
    public static void difficulty(){
        Scanner scan = new Scanner(System.in);
        while (true){
            p("How difficult would you like your opponent? (1-3) 1 being the easiest and 3 being the hardest? ");
            String input = scan.nextLine().toLowerCase();
            if (input.equals("1")){
                diff = 1;
                return;
            } else if (input.equals("2")){
                diff = 2;
                return;
            } else if(input.equals("3")){
                diff = 3;
                return;
            } else {
                p("Please enter a valid difficulty...");
            }
        }
        
 
    }
    
    
    public static int compMove(String[] board){
        int move = 0;
        Random rand = new Random();
        
        if (diff == 1){
            while (true){
               move = (int)rand.nextInt(8);
               if (board[move] != "X" && board[move] != "O"){
                   break;
               }
            }
            
        } else if (diff == 2){
            if (board[0] == "X" && board[2] == "X" && board[1] != "O"){
                move = 1;
            }
            
            
            
            
            
            
            
        } else if (diff == 3){
            
        }
        
        
        
        
        
        
        
        
        return move;
    }
    
    
    
    
    
    
    
    public static void p(String x){
        System.out.println(x);
        return;
    }
}
