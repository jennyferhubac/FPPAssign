package lesson5.question5;

import java.util.Scanner;

class Rectangle extends Shape{
	private double width;
	private double height;
	
	Rectangle()
	{
		super("Rectangle");
	}
	
	public double computeArea()
	{
		return width * height;
	}
	public double computePerimeter()
	{
		return 2 * (width * height);
	}
	public void readShape()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the width of the Rectange: ");
		if(sc.hasNextDouble())
			width = sc.nextDouble();
		System.out.print("Please input the height of the Rectange: ");
		if(sc.hasNextDouble())
			height = sc.nextDouble();
		
		sc.close();
	}
}
