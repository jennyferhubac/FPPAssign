package lesson5.question5;

import java.util.Scanner;

class Circle extends Shape{
	private double radius;
	
	Circle()
	{
		super("Circle");
	}
	
	public double computeArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double computePerimeter(){
		return 2 * Math.PI * radius;
	}
	
	public void readShape()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the radius of the Circle: ");
		if(sc.hasNextDouble())
			radius = sc.nextDouble();
		
		sc.close();
	}
}
