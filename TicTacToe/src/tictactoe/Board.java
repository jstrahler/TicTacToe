package tictactoe;

import java.awt.*;
import java.awt.event.*;

public class Board extends Frame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        boolean open = true;
        
        
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
	        
	        //Add all listeners to buttons
	        
	        //Closes window
	        addWindowListener(new WindowAdapter(){
	        	public void windowClosing(WindowEvent e) {
	        		dispose();
	        	}
	        });
	        
	        //button 1 on press
	        b1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
                            b1.setEnabled(false);
                            TicTacToe.board[0] = TicTacToe.symbol;
                            TicTacToe.turnCounter++;
                            b1.setLabel(TicTacToe.board[0]);
                            TicTacToe.checkWinConditions();
                            if (TicTacToe.winner == true)
                                open = false;
	        	}
	        });
	        
	        //button 2 on press
	        b2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
                            b2.setEnabled(false);
                            TicTacToe.board[1] = TicTacToe.symbol;
                            TicTacToe.turnCounter++;
                            b2.setLabel(TicTacToe.board[1]);
                            TicTacToe.checkWinConditions();
                            if (TicTacToe.winner == true)
                                open = false;
                            
	        	}
	        });
	        
	        //button 3 on press
	        b3.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		b3.setEnabled(false);
	        		TicTacToe.board[2] = TicTacToe.symbol;
                                
                                TicTacToe.turnCounter++;
                            b3.setLabel(TicTacToe.board[2]);
                            TicTacToe.checkWinConditions();
                            if (TicTacToe.winner == true)
                                open = false;
	        	}
	        });
	        
	      //button 4 on press
	        b4.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		 b4.setEnabled(false);
	        		TicTacToe.board[3] = TicTacToe.symbol;
                                
                                TicTacToe.turnCounter++;
                            b4.setLabel(TicTacToe.board[3]);
                            TicTacToe.checkWinConditions();
                            if (TicTacToe.winner == true)
                                open = false;
	        	}
	        });
	        
	      //button 5 on press
	        b5.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		 b5.setEnabled(false);
	        		TicTacToe.board[4] = TicTacToe.symbol;
                                
                                TicTacToe.turnCounter++;
                            b5.setLabel(TicTacToe.board[4]);
                            TicTacToe.checkWinConditions();
                            if (TicTacToe.winner == true)
                                open = false;
	        	}
	        });
	        
	      //button 6 on press
	        b6.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		b6.setEnabled(false);
	        		TicTacToe.board[5] = TicTacToe.symbol;
                                
                                TicTacToe.turnCounter++;
                            b6.setLabel(TicTacToe.board[5]);
                            TicTacToe.checkWinConditions();
                            if (TicTacToe.winner == true)
                                open = false;
	        	}
	        });
	        
	      //button 7 on press
	        b7.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
                            b7.setEnabled(false);
                            TicTacToe.board[6] = TicTacToe.symbol;
                            
                            TicTacToe.turnCounter++;
                            b7.setLabel(TicTacToe.board[6]);
                            TicTacToe.checkWinConditions();
                            if (TicTacToe.winner == true)
                                open = false;
	        	}
	        });
	        
	      //button 8 on press
	        b8.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
                            b8.setEnabled(false);
                            TicTacToe.board[7] = TicTacToe.symbol;
                            TicTacToe.turnCounter++;
                            b8.setLabel(TicTacToe.board[7]);
                            TicTacToe.checkWinConditions();
                            if (TicTacToe.winner == true)
                                open = false;
	        	}
	        });
	        
	      //button 9 on press
	        b9.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
                            b9.setEnabled(false);
                            TicTacToe.board[8] = TicTacToe.symbol;
                            TicTacToe.turnCounter++;
                            b9.setLabel(TicTacToe.board[8]);
                            TicTacToe.checkWinConditions();
                            if (TicTacToe.winner == true)
                                open = false;
                                
                            
	        	}
	        });
        }
	
	
        
       
        
        public static String[] reset(String[] board){
            for (int i = 0; i < 9; i++){
                board[i] = Integer.toString(i+1);
            }
            return board;
    }
	
    
}
