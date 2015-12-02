package lesson5.question5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = getShape();
		
		shape.readShape();
		
		System.out.printf("The area of %s is: %.2f \n", shape.getShapeName(), shape.computeArea());
		System.out.printf("The perimeter of %s is: %.2f" ,shape.getShapeName(), shape.computePerimeter());

	}
	
	public static Shape getShape()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the shape you prefer: C - Circle \n R - Rectangle \n T - Triangle ");
		char choice = sc.next().charAt(0);
		
		switch(choice)
		{
		case 'C': return new Circle();
		case 'R': return new Rectangle();
		case 'T': return new RtTriangle();
		default:
			return null;
		}
	}
}
