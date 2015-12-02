package lesson5.question4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Secretary implements Employee{
	private String employeeName;
	private String employeeID;
	private String ssn;
	private Date dateOfBirth;
	private String address;
	double hoursPerMonth;
	int yearsOfWork;
	
	Secretary()
	{
		
	}
	
	public double getHoursPerMonth() {
		return hoursPerMonth;
	}

	public void setHoursPerMonth(double hoursPerMonth) {
		this.hoursPerMonth = hoursPerMonth;
	}

	public int getYearsOfWork() {
		return yearsOfWork;
	}

	public void setYearsOfWork(int yearsOfWork) {
		this.yearsOfWork = yearsOfWork;
	}

	public double calculateSalary()
	{
		double overTime = 0;
		double tempSalary = 0;
		
		if(yearsOfWork > 5)
			tempSalary = (BASE_SALARY * hoursPerMonth) + (BASE_SALARY * .1); //add 10%
		else
			tempSalary = BASE_SALARY * hoursPerMonth;
		
		if(hoursPerMonth > 150)
			overTime = hoursPerMonth - 150;
		
		return tempSalary + (overTime * BONUS);
	}
	
	public void getEmployeeDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Employee Name: ");
		this.employeeName = sc.nextLine();
		System.out.println("Please enter Employee ID: ");
		this.employeeID = sc.nextLine();
		System.out.println("Please enter Employee SSN: ");
		this.ssn = sc.nextLine();
		
		SimpleDateFormat dtFormat = new SimpleDateFormat("dd/M/yyyy");
		System.out.println("Please enter Employee Date of Birth (dd/M/yyyy): ");
		String strDt = sc.next();
		
		try {
			this.dateOfBirth = dtFormat.parse(strDt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Please enter Employee address: ");
		this.address = sc.next();
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getSsn() {
		return ssn;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getAddress() {
		return address;
	}
}
