package lesson5.question5;

import java.util.Scanner;

class RtTriangle extends Shape{
	private double base;
	private double height;
	
	RtTriangle()
	{
		super("Right Triangle");
	}
	
	public double computeArea()
	{
		return base * height * 0.5;
	}
	
	public double computePerimeter(){
		double hypotenuse = Math.sqrt(Math.pow(base,2) + Math.pow(height, 2));
		
		return base + height + hypotenuse;
	}
	
	public void readShape()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the height of the Right Triangle: ");
		if(sc.hasNextDouble())
			height = sc.nextDouble();
		System.out.print("Please input the base of the Right Triangle: ");
		if(sc.hasNextDouble())
			base = sc.nextDouble();
		
		sc.close();
	}
}

