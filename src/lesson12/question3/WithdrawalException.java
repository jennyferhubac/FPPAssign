package lesson12.question3;

public class WithdrawalException extends Exception{
	WithdrawalException()
	{
		 super();
	}
	
	public WithdrawalException (String msg){
		super("WithdrawalException thrown: "+msg);
	}

}
