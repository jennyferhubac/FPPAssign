package lesson6.question1;

import java.awt.Font;
import java.awt.event.ActionListener;

import javafx.event.ActionEvent;

import javax.swing.*;

public class StringManipulator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame("String Manipulator Screen");
		jFrame.setSize(380, 150);
		jFrame.setLocation(500, 250);		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		layoutComponents(jFrame);
		
		jFrame.setResizable(false);
		jFrame.setVisible(true);
	}
	
	public static void layoutComponents(JFrame jFrame)
	{
		jFrame.setLayout(null);
		
		JButton btnCountLetters = new JButton("Count Letters");
		btnCountLetters.setBounds(10, 10, 145, 25);
		jFrame.add(btnCountLetters);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(165,7,50,25);
		lblInput.setFont(new Font("Calibri",Font.PLAIN, 12));
		jFrame.add(lblInput);
		
		final JTextField txtInput = new JTextField(100);
		txtInput.setBounds(165, 25, 180, 25);
		jFrame.add(txtInput);
		
		JButton btnReverse = new JButton("Reverse Letters");
		btnReverse.setBounds(10, 40, 145, 25);
		jFrame.add(btnReverse);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(165, 50, 50, 25);
		lblOutput.setFont(new Font("Calibri",Font.PLAIN, 12));
		jFrame.add(lblOutput);
		
		final JTextField txtOutput = new JTextField(100);
		txtOutput.setBounds(165, 70, 180, 25);
		jFrame.add(txtOutput);
		
		JButton btnRemoveDup = new JButton("Remove Duplicates");
		btnRemoveDup.setBounds(10, 70, 145, 25);
		jFrame.add(btnRemoveDup);
		
		//events
		btnCountLetters.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				txtOutput.setText(String.valueOf(countLetters(txtInput.getText())));
			}
		});
		
		btnReverse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				txtOutput.setText(reverseWord(txtInput.getText()));
			}
			
		});
		
		btnRemoveDup.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				txtOutput.setText(removeDuplicate(txtInput.getText()));
			}
			
		});
		
	}
	
	public static int countLetters(String str)
	{
		if(str.length() == 0)
			return 0;
		else
			return 1 + countLetters(str.substring(1));
	}
	
	public static String reverseWord(String str)
	{
		if(str.length() == 0)
			return "";
		else
			return str.charAt(str.length() - 1) + reverseWord(str.substring(0, str.length()-1));
	}
	
	public static String removeDuplicate(String str)
	{
		if(str.length() <= 1)
		 return str;
		else if(str.substring(1).contains(str.substring(0,1)))
			return removeDuplicate(str.substring(1));
		else
			return str.charAt(0) + removeDuplicate(str.substring(1));
		
	}
}
