package lesson8.question5;

public class PhoneDirectoryAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectoryOpr dirOp = new DirectoryOpr();
		
		System.out.println("Using Circular Linked List...");
		System.out.println("Directory list size: " + dirOp.size());
		System.out.println("Is the Directory list empty? " + dirOp.isEmpty() );
		dirOp.insertFirst("Victor", Long.parseLong("6414513333"));
		System.out.println(dirOp);
		dirOp.insertFirst("Raymond", Long.parseLong("6414513535"));
		System.out.println(dirOp);
		dirOp.insertLast("Andrew", Long.parseLong("6414514040"));
		System.out.println(dirOp);
		dirOp.insertLast("Vince", Long.parseLong("6414517898"));
		System.out.println(dirOp);
		System.out.println("Directory list size: " + dirOp.size());
		System.out.println("Remove first item: " + dirOp.deleteFirst());
		System.out.println(dirOp);
		System.out.println("Directory list size: " + dirOp.size());
		System.out.println("Is the Directory list empty? " + dirOp.isEmpty() );
		System.out.println("Find: " + dirOp.find("Victor"));
		System.out.println("Find: " + dirOp.find("Jenny"));

	}

}
