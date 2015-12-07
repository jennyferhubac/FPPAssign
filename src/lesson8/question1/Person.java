package lesson8.question1;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	
	public Person(String last, String first, int a)
	{
		lastName = last;
		firstName = first;
		age = a;
	}
	
	public void displayPerson()
	{
		System.out.println("Name: " + firstName + " " + lastName + "\n Age: " + age);
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + firstName + " " + lastName + "\n Age: " + age;
	}
}
