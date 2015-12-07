package lesson8.question1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonArrayOpe pArr = new PersonArrayOpe(5);
		pArr.insert("Pope", "Olivia", 35);
		pArr.insert("Hemsworth", "Chris", 32);
		pArr.insert("Keating", "Annalise", 40);
		
		System.out.println("Current size of the Person list is: " + pArr.size());
		
		pArr.insert("Wentworth", "Miller", 33);
		pArr.insert("Allen", "Barry", 25);
		
		System.out.println("Current size of the Person list is: " + pArr.size());
		
		pArr.insert("Watson", "Emma", 24);
		
		System.out.println("Current size of the Person list is: " + pArr.size());
		
		pArr.insert("Gil", "Nicky", 28);
		
		pArr.delete("Wentworth");
		
		System.out.println("Current size of the Person list is: " + pArr.size());
		
		pArr.displayAll();
		
	}
}
