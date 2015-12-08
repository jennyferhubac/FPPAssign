package lesson8.question3;


public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
		    	header.previous = n;
		    	header = n;
		}
	}

// Implement the code

	public void addLast(String item) {
		Node temp = findLast();
		temp.next = new Node(temp, item, null);
	}


	// implement the code
	public void postAddNode(Node n, String value){
		Node newNode;
		if (n == null){
			//List is empty
			newNode = new Node(null, value, null);
		}
		else if (n.next == null) {
			//n is the first node
			addLast(value);
		}
		else {
			Node temp = n.next;
			newNode = new Node(n, value, temp);	
			n.next = newNode;
		}		
					
	}
	
// implement the code

    public int Size(){
    	   int count = 1;
    	   if(header == null)
    		   return 0;
    	   else 
    	   {
    		   Node temp = header;
    		   while(temp.next!=null)
    		   {
    			   temp = temp.next;
    			   ++count;
    		   }
    	   }
    	   
    	   return count;
       }

// implement code
    public boolean isEmpty()
{
    	if(header == null)
    		return true;
    	else
    		return false;
}  

    public Object getFirst()
    {
    	if(header == null)
    		return null;
    	else
    		return header;
    }
    
    public Object getLast()
    {
    	return findLast();
    }
    
    public void removeFirst()
    {
    	if(header == null)
    		return;
    	else
    	{  
    		Node temp = header.next;
    		temp.previous = null;
    		header = temp;
    	}
    }
    
    public void removeLast()
    {
    	Node last = findLast();
    	
    	Node temp = last.previous;
    	
    	temp.next = null;
    	
    	last = null;
    	
    }
     
	public void preAddNode(Node n, String value){
		Node newNode;
		if (n == null){
			//List is empty
			newNode = new Node(null, value, null);
		}
		else if (n.previous == null) {
			//n is the first node
			addFront(value);
		}
		else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}	
					
	}
	
	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}
	
	public void deleteList(){
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void printReverse() {
		String str =""; 
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}
	
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		/*System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Apple Pie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Orange Juice");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Apple Pie"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Peach Sauce"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Carrot Cake"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteList();
		System.out.println(mySL);
		mySL.printReverse();
		*/
		
		System.out.println("Is linked list empty? " + mySL.isEmpty());
		mySL.addFront("New York Cheesecake");
		System.out.println(mySL);
		mySL.addLast("Black Bottom cupcakes");
		System.out.println(mySL);
		mySL.addLast("Reese's cupcakes");
		System.out.println(mySL);
		mySL.addLast("Red Velvet Cake");
		System.out.println(mySL);
		System.out.println("Is linked list empty? " + mySL.isEmpty());
		System.out.println("Size of the linked list is: " + mySL.Size());
		
		System.out.println(mySL.findLast().next);
		
		Node temp = mySL.findItem("Black Bottom cupcakes");
		mySL.postAddNode(temp, "Peach Float");
		System.out.println(mySL);
		
		System.out.println("The first item on the list is: " + mySL.getFirst());
		System.out.println("The last item on the list is: " + mySL.getLast());
		
		mySL.removeFirst();
		mySL.removeLast();
		
		System.out.println(mySL);
	}

}