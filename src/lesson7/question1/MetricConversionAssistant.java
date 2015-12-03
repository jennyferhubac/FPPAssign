package lesson7.question1;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.*;
import java.awt.event.ActionListener;
import java.lang.*;

import javax.swing.*;

public class MetricConversionAssistant{
	
	public static void main(String[] args)
	{
		JFrame jFrame = new JFrame("Metric Conversion Assistant");
		jFrame.setSize(380, 150);
		jFrame.setLocation(500, 250);		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		layoutComponents(jFrame);
		
		jFrame.setLocationRelativeTo(null);
		jFrame.setResizable(false);
		jFrame.setVisible(true);
	}
	
	public static void layoutComponents(JFrame jFrame)
	{
		
		JPanel jPanelMain = new JPanel();
		jPanelMain.setLayout(new GridLayout(1,2));		
		
		//LEFT SIDE
		JPanel jPanelLeft = new JPanel();
		jPanelLeft.setLayout(new GridLayout(4,4));
		
		//jPanelLeft.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		
		JLabel lblMile  = new JLabel("Mile:", SwingConstants.RIGHT);
		final JTextField txtMile = new JTextField(50);
		JLabel lblPound  = new JLabel("Pound:", SwingConstants.RIGHT);
		final JTextField txtPound = new JTextField(50);
		JLabel lblGallon  = new JLabel("Gallon:", SwingConstants.RIGHT);
		final JTextField txtGallon = new JTextField(50);
		JLabel lblFahrenheit  = new JLabel("Fahrenheit:", SwingConstants.RIGHT);
		final JTextField txtFahrenheit = new JTextField(50);
		
		jPanelLeft.add(lblMile);
		jPanelLeft.add(txtMile);
		jPanelLeft.add(lblPound);
		jPanelLeft.add(txtPound);
		jPanelLeft.add(lblGallon);
		jPanelLeft.add(txtGallon);
		jPanelLeft.add(lblFahrenheit);
		jPanelLeft.add(txtFahrenheit);
		
		//RIDE SIDE
		JPanel jPanelRight = new JPanel();
		jPanelRight.setLayout(new GridLayout(4,4));
		//jPanelRight.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		
		JLabel lblKm = new JLabel("Kilometer:", SwingConstants.RIGHT);
		final JTextField txtKm = new JTextField(50);
		JLabel lblKg  = new JLabel("Kilogram:", SwingConstants.RIGHT);
		final JTextField txtKg = new JTextField(50);
		JLabel lblLiter  = new JLabel("Liter:", SwingConstants.RIGHT);
		final JTextField txtLiter = new JTextField(50);
		JLabel lblCentigrade  = new JLabel("Centigrade:", SwingConstants.RIGHT);
		final JTextField txtCentigrade = new JTextField(50);
		
		jPanelRight.add(lblKm);
		jPanelRight.add(txtKm);
		jPanelRight.add(lblKg);
		jPanelRight.add(txtKg);
		jPanelRight.add(lblLiter);
		jPanelRight.add(txtLiter);
		jPanelRight.add(lblCentigrade);
		jPanelRight.add(txtCentigrade);
				
		//BUTTON
		JPanel jPanelButton = new JPanel();
		jPanelButton.setLayout(new FlowLayout(FlowLayout.CENTER));
		//jPanelButton.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		
		JButton btnConvert = new JButton("Convert");
		jPanelButton.add(btnConvert);
	

		jPanelMain.add(jPanelLeft);
		jPanelMain.add(jPanelRight);
		
		jFrame.add(jPanelMain, BorderLayout.CENTER);
		jFrame.add(jPanelButton, BorderLayout.PAGE_END);
		
		btnConvert.addActionListener(evt-> {
			DecimalFormat df = new DecimalFormat("#.##");
			double d = 0.0;
			if(!txtMile.getText().isEmpty())
			{
				d = convertMiletoKm(Double.parseDouble(txtMile.getText()));
				txtKm.setText(df.format(d));
			}
			if(!txtPound.getText().isEmpty())
			{
				d = convertPoundtoKilogram(Double.parseDouble(txtPound.getText()));
				txtKg.setText(df.format(d));
			}
			if(!txtGallon.getText().isEmpty())
			{
				d = convertGallontoLiter(Double.parseDouble(txtGallon.getText()));
				txtLiter.setText(df.format(d));
			}
			if(!txtFahrenheit.getText().isEmpty())
			{
				d = convertFahrenheittoCentigrade(Double.parseDouble(txtFahrenheit.getText()));
				txtCentigrade.setText(df.format(d));
			}
		});
		
	}
	
	public static double convertMiletoKm(double value)
	{
		return value * 1.609344;
	}
	
	public static double convertPoundtoKilogram(double value)
	{
		return value/2.2046;
	}
	
	public static double convertGallontoLiter(double value)
	{
		return value * 3.785;
	}
	
	public static double convertFahrenheittoCentigrade(double value)
	{
		return (value-32) *5/9;
	}

}
