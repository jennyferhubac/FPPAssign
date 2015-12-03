package lesson6.question2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.event.*;

public class RainbowColors extends JFrame{
	
	JButton btnRed = new JButton(),
			btnOrange = new JButton(),
			btnYellow = new JButton(),
			btnGreen = new JButton(),
			btnBlue = new JButton(),
			btnIndigo = new JButton(),
			btnViolet = new JButton();
	
	
	public RainbowColors()
	{
		setTitle("Rainbow Color Frame");
		setLayout((new FlowLayout(FlowLayout.LEFT)));
		setBounds(300,250, 752, 145);
		
		btnRed.setBackground(Color.RED);
		btnRed.setPreferredSize(new Dimension(100,100));
		btnRed.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		add(btnRed);
		
		btnOrange.setBackground(Color.ORANGE);
		btnOrange.setPreferredSize(new Dimension(100,100));
		btnOrange.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		add(btnOrange);
		
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.setPreferredSize(new Dimension(100,100));
		btnYellow.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		add(btnYellow);
		
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setPreferredSize(new Dimension(100,100));
		btnGreen.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		add(btnGreen);
		
		btnBlue.setBackground(Color.BLUE);
		btnBlue.setPreferredSize(new Dimension(100,100));
		btnBlue.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		add(btnBlue);
		
		btnIndigo.setBackground( new Color(75,0,130));
		btnIndigo.setPreferredSize(new Dimension(100,100));
		btnIndigo.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		add(btnIndigo);
		
		btnViolet.setBackground( new Color(159, 0, 255));
		btnViolet.setPreferredSize(new Dimension(100,100));
		btnViolet.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		add(btnViolet);

		btnRed.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton source = (JButton)e.getSource();
				JOptionPane.showMessageDialog(source, "Red is the color of fire and blood, so it is associated with energy, war, danger, strength, power, determination as well as passion, desire, and love.");
				
			}
		});
		
		btnOrange.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton source = (JButton)e.getSource();
				JOptionPane.showMessageDialog(source, "Orange represents enthusiasm, fascination, happiness, creativity, determination, attraction, success, encouragement, and stimulation.");
			}
			
		});
		
		btnYellow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton source = (JButton)e.getSource();
				JOptionPane.showMessageDialog(source, "Yellow is the color of sunshine. It's associated with joy, happiness, intellect, and energy.");
			}
			
		});
		
		btnGreen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton source = (JButton)e.getSource();
				JOptionPane.showMessageDialog(source, "Green is the color of nature. It symbolizes growth, harmony, freshness, and fertility. Green has strong emotional correspondence with safety. Dark green is also commonly associated with money.");
			}
			
		});
		
		
		btnBlue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton source = (JButton)e.getSource();
				JOptionPane.showMessageDialog(source, "Blue is the color of the sky and sea. It is often associated with depth and stability. It symbolizes trust, loyalty, wisdom, confidence, intelligence, faith, truth, and heaven.");
			}
		});
		
		btnIndigo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton source = (JButton)e.getSource();
				JOptionPane.showMessageDialog(source, "Indigo symbolizes a mystical borderland of wisdom, self-mastery and spiritual realization.");
			}
		});
		
		btnViolet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton source = (JButton)e.getSource();
				JOptionPane.showMessageDialog(source, "Violet is the color of spirituality.  It is the color of people seeking spiritual fulfillment.");
			}
		});
			
	}
			

	public static void main(String[] args)
	{
		RainbowColors flb = new RainbowColors();
		flb.setVisible(true);
		flb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
