package lesson9.question3;

import java.util.Stack;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=============Using Array Stack=========");
		System.out.println("Is aabbaa palindrome? "+ isPalindrome("aabbaa"));
		System.out.println("Is avavav palindrome? "+ isPalindrome("avavav"));
		System.out.println("Is 110011 palindrome? "+ isPalindrome("110011"));
		System.out.println("=============Using predefined Stack=============");
		System.out.println("Is aabbaa palindrome? "+ isPalindrome("aabbaa"));
		System.out.println("Is avavav palindrome? "+ isPalindrome("avavav"));
		System.out.println("Is 110011 palindrome? "+ isPalindrome("110011"));
		

	}
	
	public static boolean isPalindrome(String str)
	{
		boolean isPalindrome = false;
		
		if(str.length() != 0)
		{
			if(str.equalsIgnoreCase(reverseString(str)))
				isPalindrome = true;
		}
		
		return isPalindrome;
	}
	
	public static boolean isPalindromeUsingPredefinedStack(String str)
	{
		boolean isPalindrome = false;
		
		if(str.length() != 0)
		{
			if(str.equalsIgnoreCase(reverseStringUsingPredefinedStack(str)))
				isPalindrome = true;
		}
		
		return isPalindrome;
	}
	
	public static String reverseString(String str)
	{
		String reverseStr = "";
		
		StackClass sc = new StackClass(str.length());
		
		for(int i = 0; i < str.length(); i++)
		{
			sc.push(str.charAt(i));
		}
		
		while(!sc.isEmpty())
		{
			reverseStr += String.valueOf(sc.pop());
		}
		
		return reverseStr;
	}
	
	public static String reverseStringUsingPredefinedStack(String str)
	{
		Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reverseInput = "";

        while (!stack.isEmpty()) {
            reverseInput += stack.pop();
        }
        
        return  reverseInput;
        	

	}

}
