package lesson5.question6;

public class NoteBook extends Computer implements Cloneable{
	double height;
	double width;
	double weight;
	
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
	
	@Override
	public boolean equals(Object n)
	{
		if(n==null) return false;
		if(!(n instanceof NoteBook)) return false;
		NoteBook nb = (NoteBook)n;
		boolean isEqual = (this.height == nb.height &&
				this.width == nb.width &&
				this.weight == nb.weight &&
				manufacturer.equals(nb.manufacturer) &&
				processor.equals(nb.processor) && 
				ramSize == nb.ramSize &&
				diskSize == nb.diskSize &&
				processorSpeed == nb.processorSpeed);

		
		return isEqual;
	}
	
	@Override
	public int hashCode()
	{
		int hash = 37;
		int code = 0;
		
		//height
		long heightBits = Double.doubleToLongBits(height);
		code = (int)(heightBits ^ (heightBits >>> 32));
		hash = hash * 59 + code;
		
		//width
		long widthBits = Double.doubleToLongBits(width);
		code = (int)(widthBits ^ (widthBits >>> 32));
		hash = hash * 59 + code;
		
		//weight
		long weightBits = Double.doubleToLongBits(weight);
		code = (int)(weightBits ^ (weightBits >>> 32));
		hash = hash * 59 + code;
		
		return hash;
	}
	
	public Object clone() throws CloneNotSupportedException {
		NoteBook clone = (NoteBook)super.clone();
		return clone;
	}
}
