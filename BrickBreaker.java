import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;



public class BrickBreaker extends JFrame implements ActionListener{

	private Timer timer;
	
	public BrickBreaker() {
		
		setSize(650, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
/*
		canvas = new DrawPanel();
		canvas.setBounds(0, 0, 300, 575);
		canvas.setBackground(Color.white);
		canvas.setBorder(BorderFactory.createLineBorder(Color.black));

		add(canvas);

		canvas.repaint();
*/	
		
		setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		new BrickBreaker();
		
	}
	
}
