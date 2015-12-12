package lesson12.question3;

public class BelowBalanceException extends Exception{
	
	BelowBalanceException()
	{
		super();
	}
	
	BelowBalanceException(String msg)
	{
		super("BelowBalanceException thrown: "+ msg);
	}

}
