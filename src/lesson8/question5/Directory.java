package lesson8.question5;

class Directory {
	String name;
	long pno; // Phone number
	Directory next;

	public Directory(String name, long pno) { // Initialize values
		this.name = name;
		this.pno = pno;
	}

	// -------------------------------------------------------------
	public void displayDirectory() // display values of single element
	{
		System.out.println("Name: " + name + " Phone: " + String.valueOf(pno)  + "");
	}
	
	@Override
	public String toString()
	{
		return "[Name: " + name + " Phone: " + String.valueOf(pno)  + "]";
	}
}
