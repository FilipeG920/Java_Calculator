package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	JTextField textField;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[8];
	
	JButton buttonSUM, buttonSUB, buttonMUL, buttonDIV; 
	JButton decButton, equButton, delButton, clrButton;
	Font myFont = new Font("Roboto", Font.BOLD,20);
	JLabel label;
	
	double num1 = 0, num2 = 0;
	char operator;
	
	MyFrame(){
		textField = new JTextField();
		textField.setBounds(10, 25, 410, 150);
		textField.setBackground(Color.white);
		textField.setFont(myFont);
		textField.setFocusable(false);
		textField.setEditable(false);
		
		// Creating the buttons of numbers, buttons of functions and its panels
		JPanel panel = new JPanel(new GridLayout(4, 4, 0, 0));
		//panel.setPreferredSize(new Dimension(250, 250));
		panel.setBounds(10, 200, 250, 250);
		panel.setBackground(Color.lightGray);
		
		buttonSUM = new JButton("+");
		buttonSUB = new JButton("-");
		buttonMUL = new JButton("X");
		buttonDIV = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("DELETE");
		clrButton = new JButton("CLEAR");
		
		functionButtons[0] = buttonSUM;
		functionButtons[1] = buttonSUB;
		functionButtons[2] = buttonMUL;
		functionButtons[3] = buttonDIV;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		
		for (int i = 0; i < numberButtons.length; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFocusable(false);
			numberButtons[i].setFont(myFont);
		}
		
		for (int i = 0; i < functionButtons.length; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFocusable(false);
			functionButtons[i].setFont(myFont);
		}
		
		panel.add(numberButtons[9]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[7]);
		panel.add(buttonSUM);
		panel.add(numberButtons[6]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[4]);
		panel.add(buttonSUB);
		panel.add(numberButtons[3]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[1]);
		panel.add(buttonMUL);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(buttonDIV);

		delButton.setBounds(270, 200, 120, 50);
		clrButton.setBounds(270, 260, 120, 50);
		
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450,500);
		this.setLayout(null);
		this.add(textField);
		this.add(delButton);
		this.add(clrButton);
		this.add(panel);
		this.setVisible(true);
		//this.setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
