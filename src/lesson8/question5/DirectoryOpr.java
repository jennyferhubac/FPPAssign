package lesson8.question5;

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
		if(first == null)
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
			first.next = first;
			last = first;
		}
		else
		{
			Directory temp = new Directory(name, pno);
			temp.next = first;
			first = temp;
			last.next = first;
		}
		
	}

	// -------------------------------------------------------------
	public void insertLast(String name, long pno) // insert at end of list
	{
		if (first == null && last == null)
			insertFirst(name,pno);
		else {
			Directory temp = first;
			while (temp.next != first)
				temp = temp.next;
			
			temp.next = new Directory(name,pno);
			temp.next.next = first;
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
			last.next = first;
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
   		   while(temp.next!=first)
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
		do {
			str = str + "-->[" + temp.toString() + "]";
			temp = temp.next;
		}while (temp.next != first);
		
		if(temp.next == first && first!=last)
			str = str + "-->[" + temp.toString() + "]";
		
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
		do{
			if (key.equalsIgnoreCase(temp.name))
				return temp;
			else
				temp = temp.next;
		}while (temp.next != first);
		
		if(temp.next == first && first!=last)
		{
			if (key.equalsIgnoreCase(temp.name))
				return temp;
		}
		
		return null;
	 }
  	}

@Override
public String toString()
{
	String str =""; 
	Directory temp = first;
	do {
		str = str + "-->[" + temp.toString() + "]";
		temp = temp.next;
	}while (temp.next != first);
	
	if(temp.next == first && first!=last)
		str = str + "-->[" + temp.toString() + "]";
	
	str = str + "-->[" + "NULL" + "]";
	return str;
}
 }

