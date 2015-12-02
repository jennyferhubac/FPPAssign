package lesson5.question4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Manager implements Employee{
	private String employeeName;
	private String employeeID;
	private String ssn;
	private Date dateOfBirth;
	private String address;
	double hoursPerMonth;
	int yearsOfWork;
	double extraHours;
	
	Manager()
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

	public double getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(double extraHours) {
		this.extraHours = extraHours;
	}

	public double calculateSalary()
	{
		double overTime = 0;
		
		if(hoursPerMonth > 150)
			overTime = hoursPerMonth - 150;
		
		return BASE_SALARY * (hoursPerMonth * 2) + (overTime * EXTRA_HOURS);
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
