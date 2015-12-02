package lesson5.question2;

public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	
	Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed)
	{
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}
	public int getRamSize() {
		return ramSize;
	}
	public int getDiskSize() {
		return diskSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	public double computePower()
	{
		return ramSize * processorSpeed;
	}
}
