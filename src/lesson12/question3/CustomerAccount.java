package lesson12.question3;

import java.text.DecimalFormat;

public class CustomerAccount {
	private String Cus_name;
	private String Acc_No;
	private double Balance;
	
	CustomerAccount(String Cus_name, String Acc_No, double Balance)
	{
		this.Cus_name = Cus_name;
		this.Acc_No = Acc_No;
		this.Balance = Balance;
	}
	
	public void withdraw(double withdrawalAmount) //reduce the balance
	{
		DecimalFormat df = new DecimalFormat("#.##");
		try
		{
			
		if(withdrawalAmount > Balance)
		{
			throw new WithdrawalException("Withdrawal amount of: " + df.format(withdrawalAmount) + " exceeds current balance.");
		}
		else
		{
			Balance = Balance - withdrawalAmount;
			if(Balance < 100)
			{
				
				throw new BelowBalanceException("Balance should not be below 100. Current Balance is: " + df.format(Balance));
			}
			else
				System.out.println("Successful withdrawal.");
		}
		}
		catch(WithdrawalException e)
		{
			e.printStackTrace();
		}
		catch(BelowBalanceException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public void deposit(double depositAmount) //increase balance
	{
		if(depositAmount > 0)
		{
			Balance = Balance + depositAmount;
			System.out.println("Successful deposit! Current Balance: " + String.valueOf(Balance));
		}
		else
		{
			System.out.println("Deposit failed.  Please deposit a positive amount.");
		}
	}

}
