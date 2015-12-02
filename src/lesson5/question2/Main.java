package lesson5.question2;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb1 = new NoteBook("Acer", "Intel", 16, 250, 1.5, 3.5, 4.5, 1.5);
		
		System.out.println("The notebook's screensize is: " + nb1.screensize());
		System.out.println("The computer power is: " + nb1.computePower());
		
	}
}
