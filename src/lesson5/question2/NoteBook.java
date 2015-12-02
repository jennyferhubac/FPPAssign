package lesson5.question2;

public class NoteBook extends Computer{
	private double height;
	private double width;
	private double weight;
	
	NoteBook(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed, double height, double width, double weight)
	{
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		this.height = height;
		this.width = width;
		this.weight = weight;		
	}
	
	public double screensize()
	{
		return height * width;
	}
}
