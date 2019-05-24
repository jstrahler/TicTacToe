
package tictactoe;
import java.awt.*;

public class Board extends Frame {
	
	public static void main(String args[]) {
		BoardFrame();
    	Buttons();
	}

    public static void display(String[] board){
        
    }
    
    public static void BoardFrame() {
    	setSize(300, 300);
    	setLayout(null);
    	setVisible(true);
    }
    public static void Buttons(){
    	Button a = new Button("Click me");
    	a.setBounds(30, 100, 80, 30);
    	add(a);
    }
    
    public static String[] reset(String[] board){
        for (int i = 0; i < 9; i++){
            board[i] = Integer.toString(i+1);
        }
        return board;
    }
    
}
