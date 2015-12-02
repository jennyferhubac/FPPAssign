package lesson5.question3;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer comp = new NoteBook("Acer", "Intel", 16, 250, 1.5, 10.5, 13.5, 1.5);
		
		System.out.println("Manufacturer: " + comp.manufacturer);
		System.out.println("Processor: " + comp.processor);
		System.out.println("Computer Power: " + comp.computePower());
		System.out.println("Price: $" + comp.costProduct());
		

	}

}
