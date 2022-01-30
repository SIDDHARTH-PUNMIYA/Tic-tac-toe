import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Tictactoe implements ActionListener {
	JFrame frame = new JFrame();
	JPanel button_panel = new JPanel();
	JPanel text_panel = new JPanel();	
	JLabel text = new JLabel();
	JButton [] jb = new JButton[9];
	boolean p1 =true;
	Tictactoe(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setTitle("TIC TAC TOE GAME");
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		text.setBackground(new Color(25,25,25));
		 text.setForeground(new Color(25,255,0));
	     text.setFont(new Font("Ink Free",Font.BOLD,55));
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setText("TIC-TAC-TOE");  
		text.setOpaque(true);
		text_panel.setLayout(new BorderLayout());
		text_panel.setBounds(0,0,800,100);
		button_panel.setLayout(new GridLayout(3,3));
		button_panel.setBackground(new Color(150,150,150));
	  
		for(int i =0;i<9;i++) {
			jb[i]= new JButton();
			jb[i].addActionListener(this);
			button_panel.add(jb[i]);
			jb[i].setFont(new Font("MV Boli",Font.BOLD,100));
			jb[i].setFocusable(false);
			
		}
		text_panel.add(text);
		frame.add(text_panel,BorderLayout.NORTH);
		frame.add(button_panel);
		  
		      }

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<9;i++) {
		if(e.getSource()==jb[i]) {
			if(p1==true) {
			jb[i].setText("X");
			jb[i].setForeground(Color.RED);
			//	jb[i].setEnabled(false);;
			p1=false;
			}
			else {
				jb[i].setText("O");
			//	jb[i].setEnabled(false);
				jb[i].setForeground(Color.GREEN);
				p1=true;
			}
		}
			check();
			}
	}
	public void disable() {
		 for(int i=0;i<9;i++) {
			 jb[i].setEnabled(false);
		 }
	}
	public void check() 
	{
		if(jb[0].getText()=="X" && jb[1].getText()=="X" && jb[2].getText()=="X") 
		{
			 Xwins(0,1,2);
			disable();
			 
		}
		if(jb[3].getText()=="X" && jb[4].getText()=="X" && jb[5].getText()=="X") 
		{
			 Xwins(3,4,5);
			 disable();
		}
		if(jb[6].getText()=="X" && jb[7].getText()=="X" && jb[8].getText()=="X") 
		{
			 Xwins(6,7,8);
			 disable();
			 }
		if(jb[0].getText()=="X" && jb[3].getText()=="X" && jb[6].getText()=="X") 
		{
			 Xwins(0,3,6);
			disable();
			 
		}
		if(jb[1].getText()=="X" && jb[4].getText()=="X" && jb[7].getText()=="X") 
		{
			 Xwins(1,4,7);
			disable();
			 
		}
		if(jb[2].getText()=="X" && jb[5].getText()=="X" && jb[8].getText()=="X") 
		{
			 Xwins(2,5,8);
			disable();
			 
		}
		if(jb[0].getText()=="X" && jb[4].getText()=="X" && jb[8].getText()=="X") 
		{
			 Xwins(0,4,8);
			disable();
			 
		}if(jb[2].getText()=="X" && jb[4].getText()=="X" && jb[6].getText()=="X") 
		{
			 Xwins(2,4,6);
			disable();
			 
		}
		// FOR O TO WIN
		if(jb[0].getText()=="O" && jb[1].getText()=="O" && jb[2].getText()=="O") 
		{
			 Owins(0,1,2);
			disable();
			 
		}
		if(jb[3].getText()=="O" && jb[4].getText()=="O" && jb[5].getText()=="O") 
		{
			 Owins(3,4,5);
			 disable();
		}
		if(jb[6].getText()=="O" && jb[7].getText()=="O" && jb[8].getText()=="O") 
		{
			 Owins(6,7,8);
			 disable();
			 }
		if(jb[0].getText()=="O" && jb[3].getText()=="O" && jb[6].getText()=="O") 
		{
			 Owins(0,3,6);
			disable();
			 
		}
		if(jb[1].getText()=="O" && jb[4].getText()=="O" && jb[7].getText()=="O") 
		{
			 Owins(1,4,7);
			disable();
			 
		}
		if(jb[2].getText()=="O" && jb[5].getText()=="O" && jb[8].getText()=="O") 
		{
			 Owins(2,5,8);
			disable();
			 
		}
		if(jb[0].getText()=="O" && jb[4].getText()=="O" && jb[8].getText()=="O") 
		{
			 Owins(0,4,8);
			disable();
			 
		}if(jb[2].getText()=="O" && jb[4].getText()=="O" && jb[6].getText()=="O") 
		{
			 Owins(2,4,6);
			disable();
			 
		}
	}
    public void Xwins(int a,int b,int c) {
    	text.setText("X Wins at position "+a+" "+b+" "+c);
    }
    public void Owins(int a,int b,int c) {
    	text.setText("O Wins at position "+a+" "+b+" "+c);
    }
	
}
