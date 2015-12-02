package lesson5.question6;

public class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	
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
	@Override
	public boolean equals(Object c)
	{
		if(c==null) return false;
		if(!(c instanceof Computer)) return false;
		Computer comp = (Computer)c;
		boolean isEqual = (this.manufacturer.equals(comp.manufacturer) && 
				this.processor.equals(comp.processor) && 
				this.ramSize == comp.ramSize &&
				this.diskSize == comp.diskSize &&
				this.processorSpeed == comp.processorSpeed);
		return isEqual;
	}
	
	@Override
	public int hashCode()
	{
		int hash = 37;
		int code = 0;
		
		//manufacturer
		code = (manufacturer==null?0:manufacturer.hashCode());
		hash = hash * 59 + code;
		//processor
		code = (processor==null?0:processor.hashCode());
		hash = hash * 59 + code;
		//ramSize
		code = ramSize;
		hash = hash * 59 + code;
		//diskSize
		code = diskSize;
		hash = hash * 59 + code;
		//processorSpeed
		long processorSpeedBits = Double.doubleToLongBits(processorSpeed);
		code = (int)(processorSpeedBits ^ (processorSpeedBits >>> 32));
		hash = hash * 59 + code;
		
		return hash;
	}
}

