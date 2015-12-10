package lesson9.question3;

public class StackClass {
	private char[] stack;
	private int currIndex = 0;
	
	StackClass(int capacity){
		stack = new char[capacity];
	}
	
	public void push(char ch)
	{
		stack[currIndex] = ch;
		currIndex++;
	}	
	
	public char pop()
	{
		--currIndex;
		return stack[currIndex];
	}
	
	public boolean isEmpty()
	{
		return currIndex == 0;
	}
	
	public int size()
	{
		return currIndex + 1;
	}

}
