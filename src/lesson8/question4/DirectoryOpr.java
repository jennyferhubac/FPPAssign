package lesson8.question4;

import lesson8.question3.MyStringLinkedList.Node;

class DirectoryOpr {
	private Directory first; // ref to first Directory
	private Directory last; // ref to last Directory

	// -------------------------------------------------------------
	public DirectoryOpr() // constructor
	{
		first = null;
		last = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if no Directory in your list
	{
		if(first == null && last == null)
			return true;
		else
			return false;
	}

	// -------------------------------------------------------------
	public void insertFirst(String name, long pno) // insert at front of list
	{
		if(first == null)
		{
			first = new Directory(name, pno);
			first.next = null;
		}
		else
		{
			Directory temp = new Directory(name, pno);
			temp.next = first;
			first = temp;			
		}
		
	}

	// -------------------------------------------------------------
	public void insertLast(String name, long pno) // insert at end of list
	{
		if (first == null && last == null)
			insertFirst(name,pno);
		else {
			Directory temp = first;
			while (temp.next != null)
				temp = temp.next;
			
			temp.next = new Directory(name,pno);
			temp.next.next = null;
			last = temp.next;
		}
	}

	// -------------------------------------------------------------
	public Directory deleteFirst() // delete first Directory
	{
		//returns deleted first
		Directory origFirst;
		if(first == null)
			return null;
		else
		{
			origFirst = first;
			Directory temp = first.next;
			first.next = null;
			first = temp;
			return origFirst;
		}
	}
// -------------------------------------------------------------
	public int size() {
	   int count = 1;
   	   if(first == null)
   		   return 0;
   	   else 
   	   {
   		   Directory temp = first;
   		   while(temp.next!=null)
   		   {
   			   temp = temp.next;
   			   ++count;
   		   }
   	   }
   	   
   	   return count;
			}
// -------------------------------------------------------------
	public void displayList() {
		String str =""; 
		Directory temp = first;
		while (temp != null) {
			str = str + "-->[" + temp.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		System.out.println(str);
	}
// -------------------------------------------------------------
public Directory find(String key)      // find link with given key
    	{
	if (first == null)
		return null;
	else {
		Directory temp = first;
		while (temp != null)
			if (key.equalsIgnoreCase(temp.name))
				return temp;
			else
				temp = temp.next;
		return null;
	}
  	}

@Override
public String toString()
{
	String str =""; 
	Directory temp = first;
	while (temp != null) {
		str = str + "-->[" + temp.toString() + "]";
		temp = temp.next;
	}
	str = str + "-->[" + "NULL" + "]";
	return str;
}
 }

