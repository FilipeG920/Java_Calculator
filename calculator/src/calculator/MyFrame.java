package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener {

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	
	JButton buttonSUM;
	JButton buttonSUB;
	JButton buttonMUL;
	JButton buttonDIV;
	
	JLabel label;
	
	MyFrame(){
		// Creating the buttons of numbers and its panels
		JPanel panel = new JPanel(new GridLayout(3, 3, 0, 0));
		//panel.setPreferredSize(new Dimension(250, 250));
		panel.setBounds(10, 200, 250, 250);
		panel.setBackground(Color.lightGray);
		
		panel.add(button1 = new JButton("1"));
		panel.add(button2 = new JButton("2"));
		panel.add(button3 = new JButton("3"));
		panel.add(button4 = new JButton("4"));
		panel.add(button5 = new JButton("5"));
		panel.add(button6 = new JButton("6"));
		panel.add(button7 = new JButton("7"));
		panel.add(button8 = new JButton("8"));
		panel.add(button9 = new JButton("9"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,500);
		this.setLayout(null);
		this.add(panel);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
