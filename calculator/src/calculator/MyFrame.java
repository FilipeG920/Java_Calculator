package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

	private JTextField textField;
	private JButton[] numberButtons = new JButton[10];
	private JButton[] functionButtons = new JButton[9];
	
	private JButton buttonSUM, buttonSUB, buttonMUL, buttonDIV; 
	private JButton decButton, equButton, delButton, clrButton, negButton;
	private Font myFont = new Font("Roboto", Font.BOLD,20);
	
	double num1 = 0, num2 = 0, result = 0;
	char operator;
	
	MyFrame(){
		textField = new JTextField();
		textField.setBounds(10, 25, 410, 40);
		textField.setBackground(Color.white);
		textField.setFont(myFont);
		textField.setFocusable(false);
		textField.setEditable(false);
		
		// Creating the buttons of numbers, buttons of functions and its panels
		JPanel panel = new JPanel(new GridLayout(4, 4, 0, 0));
		panel.setBounds(10, 80, 250, 250);
		panel.setBackground(Color.lightGray);
		
		buttonSUM = new JButton("+");
		buttonSUB = new JButton("-");
		buttonMUL = new JButton("X");
		buttonDIV = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("DELETE");
		clrButton = new JButton("CLEAR");
		negButton = new JButton("NEGATIVE");
		
		functionButtons[0] = buttonSUM;
		functionButtons[1] = buttonSUB;
		functionButtons[2] = buttonMUL;
		functionButtons[3] = buttonDIV;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;
		
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

		delButton.setBounds(270, 80, 140, 50);
		clrButton.setBounds(270, 140, 140, 50);
		negButton.setBounds(270, 200, 140, 50);
		
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450,500);
		this.setLayout(null);
		this.add(textField);
		this.add(delButton);
		this.add(clrButton);
		this.add(negButton);
		this.add(panel);
		this.setVisible(true);
		//this.setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 10; i++) {
			if (e.getSource() == numberButtons[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
 			}
		}
		
		if (e.getSource() == decButton) {
			textField.setText(textField.getText().concat(String.valueOf(".")));
		}
		
		if (e.getSource() == buttonSUM) {
			num1 = Double.parseDouble(textField.getText());
			operator = '+';
			textField.setText("");
		}
		
		if (e.getSource() == buttonSUB) {
			num1 = Double.parseDouble(textField.getText());
			operator = '-';
			textField.setText("");		
		}
		
		if (e.getSource() == buttonMUL) {
			num1 = Double.parseDouble(textField.getText());
			operator = 'x';
			textField.setText("");		
		}
		
		if (e.getSource() == buttonDIV) {
			num1 = Double.parseDouble(textField.getText());
			operator = '/';
			textField.setText("");		
		}
		
		if (e.getSource() == equButton) {
			num2 = Double.parseDouble(textField.getText());
			
			switch(operator) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case 'x':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
			}
			
			textField.setText(String.valueOf(result));
			num1 = result;
		}
		
		if (e.getSource() == clrButton) {
			textField.setText("");
		}
		
		if (e.getSource() == delButton) {
			String string = textField.getText();
			textField.setText("");
			for (int i = 0; i < string.length() - 1; i++){
				textField.setText(textField.getText() + string.charAt(i));
			}
		}
		
		if (e.getSource() == negButton) {
			double temp = Double.parseDouble(textField.getText());
			temp *= -1;
			textField.setText(String.valueOf(temp));
		}
	}

}
