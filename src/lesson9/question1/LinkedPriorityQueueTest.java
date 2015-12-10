package lesson9.question1;

class LinkedPriorityQueue
{
class Node
{ int data;
Node next;
Node(int item)
// constructor
{ data = item; }
}
Node front, rear;
int count;
public void add(int item)
{
	Node n = front;
	front = add(n,item);
}

private Node add(Node node, int item)
{
	Node newNode = createNewNode(item);
	if(node == null)
		return newNode;
	
	if(node.data > item)
	{
		newNode.next = node;
		node = newNode;
	}
	else
	{
		node.next = add(node.next, item);
	}
	
	return node;
}

private Node createNewNode(int item)
{
	count++;
	return new Node(item);
}


public int remove()
{ if(isEmpty())
{ System.out.println("Q is empty"); return -1; }
int item = front.data;
front = front.next;
count--;
// decrement queue size
return item;
}
	
	public boolean isEmpty()
	{ return (front == null); }
	
	public int peek()
	{ return front.data; }
	
	public int size()
	{ return count;
	}
	
	public void	display()
	{ Node p = front;
	System.out.print("Linked Priority Q: ");
	if(p == null) System.out.println("empty");
	while( p != null )
	{
	System.out.print(p.data + " ");
	p = p.next;
	}
	System.out.println();
	}
	}

public class LinkedPriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedPriorityQueue lpq = new LinkedPriorityQueue();
		
		System.out.println("Is the Linked Priority Q empty? "+ lpq.isEmpty());
		lpq.display();
		lpq.add(1);
		lpq.display();
		lpq.add(2);
		lpq.display();
		lpq.add(5);
		lpq.display();
		lpq.add(4);
		lpq.display();
		lpq.add(4);
		lpq.display();
		lpq.add(12);
		lpq.display();
		System.out.println("Is the Linked Priority Q empty? "+ lpq.isEmpty());
		lpq.remove();
		lpq.display();
	}

}
