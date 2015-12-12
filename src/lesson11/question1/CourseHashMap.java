package lesson11.question1;

import java.util.*;

class Course{
	private String c_name;
	private String[] faculty;
	
	Course(String c_name, String[] faculty)
	{
		this.c_name = c_name;
		this.faculty = faculty;
	}
	
	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String[] getFaculty() {
		return faculty;
	}

	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString()
	{
		return c_name + "-" + Arrays.toString(faculty);
	}
}

public class CourseHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Course> hashMap = new HashMap<String, Course>();
		
		hashMap.put("CS390", new Course("FPP", new String[] {"Renuka", "Joe Lermon", "Paul"}));
		hashMap.put("CS401", new Course("MPP", new String[] {"Adam", "Blake", "Pharell"}));
		hashMap.put("CS435", new Course("Alogrithms", new String[] {"Blair", "Serena", "Jenny"}));
		hashMap.put("CS430", new Course("BI", new String[] {"Sam", "Miranda", "Nicole"}));
		hashMap.put("CS472", new Course("WAP", new String[] {"Dennis", "Regan", "Richard"}));
		
		System.out.println("Is CS466 in the hashmap? " + hashMap.containsKey("CS466"));
		System.out.println("Is CS401 in the hashmap? " + hashMap.containsKey("CS401"));
		
		System.out.println("Key list: " + hashMap.keySet());
		System.out.println("Value list: " + hashMap.values());
		
		hashMap.forEach((cid, course) -> System.out.println(course));
		
		System.out.println("Hashmap size: " + hashMap.size());
		

	}

}
