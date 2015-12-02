package lesson5.question5;

abstract class Shape{
	String shapeName;
	
	Shape(String shapeName)
	{
		this.shapeName = shapeName;
	}
	
	public String getShapeName()
	{
		return shapeName;
	}
	@Override
	public String toString()
	{
		return "This is shape: " + shapeName;
	}
	
	abstract double computeArea();
	abstract double computePerimeter();
	abstract void readShape();
	
}
