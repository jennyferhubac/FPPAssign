package lesson12.question3;

public class CustomerAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerAccount ca1 = new CustomerAccount("Anna", "001-1010-2323", 5545.45);
		CustomerAccount ca2 = new CustomerAccount("Elsa", "001-1010-4321", 2135.78);
		
		ca1.withdraw(6000.00); //throw WithdrawalException
		//ca2.withdraw(2100); // throw BelowBalanceException
		
	}

}
