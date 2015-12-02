package lesson5.question6;

	public class Main {public static void main(String[] args) {
		NoteBook nb1 = new NoteBook("Acer", "Intel", 16, 250, 1.5, 3.5, 4.5, 1.5);
		NoteBook nb2 = new NoteBook("Acer", "Intel", 16, 250, 1.5, 3.5, 4.5, 1.5);
		NoteBook nb3 = new NoteBook("Asus", "Intel", 16, 150, 1.5, 3.5, 4.5, 1.5);
		NoteBook nb4 = nb1;
		
		System.out.println(nb1.equals(nb2));
		System.out.println(nb1.equals(nb3));
		System.out.println(nb1.equals(nb4));
		System.out.println(nb2.equals(nb4));
		
		System.out.println("============================");
		
		
		Computer c1 = new Computer("Acer", "Intel", 16, 250, 1.5);
		Computer c2 = new Computer("Acer", "Intel", 16, 250, 1.5);
		Computer c3 = new Computer("Asus", "Intel", 16, 250, 1.5);
		Computer c4 = c3;
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		System.out.println(c2.equals(c4));
		System.out.println(c3.equals(c4));
		
		System.out.println("c1 hashcode: " + c1.hashCode());
		System.out.println("c2 hashcode: " + c2.hashCode());
		System.out.println("c3 hashcode: " + c3.hashCode());
		System.out.println("c4 hashcode: " + c4.hashCode());
		
		
	
	}

}
