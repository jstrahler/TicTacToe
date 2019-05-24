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
    	setVisible(true);import java.awt.*;

public class Board extends Frame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Board(){
		 Button b1=new Button(""); 
		 Button b2=new Button("");
		 Button b3=new Button("");
		 Button b4=new Button("");
		 Button b5=new Button("");
		 Button b6=new Button("");
		 Button b7=new Button("");
		 Button b8=new Button("");
		 Button b9=new Button("");
	        
	        // setting button position on screen
	       	b1.setBounds(75, 75, 50, 50);
	        b2.setBounds(125, 75, 50, 50);
	        b3.setBounds(175, 75, 50, 50);
	        b4.setBounds(75, 125, 50, 50);
	        b5.setBounds(125, 125, 50, 50);
	        b6.setBounds(175, 125, 50, 50);
	        b7.setBounds(75, 175, 50, 50);
	        b8.setBounds(125, 175, 50, 50);
	        b9.setBounds(175, 175, 50, 50);
	        
	        
	        //adding button into frame 
	        add(b1);
	        add(b2);
	        add(b3);
	        add(b4);
	        add(b5);
	        add(b6);
	        add(b7);
	        add(b8);
	        add(b9);
	        
	        //Setting Frame width and height
	        setSize(300,300); 
	        
	        //Setting the title of Frame
	        setTitle("TicTacToe"); 
	        
	        //Setting the layout for the Frame
	        setLayout(null);
	        
	        
	        
	        /* By default frame is not visible so 
	         * we are setting the visibility to true 
	         * to make it visible.
	         */
	        setVisible(true);  
	}
	
	public static void main(String args[]) {
		Board bf = new Board();
	}
    
    
}

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
    

    
    public static void p(String x){
        System.out.println(x);
        return;
    }
    
}


