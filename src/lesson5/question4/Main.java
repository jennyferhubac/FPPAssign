package lesson5.question4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mgr = new Manager();
		Secretary sec = new Secretary();
		
		System.out.println("Enter Manager's Information: ");
		mgr.getEmployeeDetails();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi " + mgr.getEmployeeName() + ", please enter total working hours per month: ");
		if(sc.hasNextDouble())
			mgr.setHoursPerMonth(sc.nextDouble());
		System.out.println("Please enter total years of work: ");
		if(sc.hasNextInt())
			mgr.setYearsOfWork(sc.nextInt());
		System.out.println("Please enter if you have extra hours of work.  Input 0 if none.");
		if(sc.hasNextDouble())
			mgr.setExtraHours(sc.nextDouble());
		
		System.out.println("Enter Secretary's Information" );
		sec.getEmployeeDetails();
		System.out.println("Hi " + sec.getEmployeeName() + ", please enter total working hours per month: ");
		if(sc.hasNextDouble())
			sec.setHoursPerMonth(sc.nextDouble());
		System.out.println("Please enter total years of work: ");
		if(sc.hasNextInt())
			sec.setYearsOfWork(sc.nextInt());
		
		System.out.println("===============================");
		System.out.println("Manager's Information");
		System.out.println("Employee Name: " + mgr.getEmployeeName());
		System.out.println("Employee ID: " + mgr.getEmployeeID());
		System.out.println("Employee DOB: " + mgr.getDateOfBirth());
		System.out.println("Employee SSN: " + mgr.getSsn());
		System.out.println("Employee Address: " + mgr.getAddress());
		System.out.println("Total years of work: " + mgr.getYearsOfWork());
		System.out.println("Total hours of work per month: " + mgr.getHoursPerMonth());
		System.out.println("Total extra hours: " + mgr.getExtraHours());
		System.out.println("Current monthly salary: " + mgr.calculateSalary());
		
		System.out.println("===============================");
		System.out.println("Secretary's Information");
		System.out.println("Employee Name: " + sec.getEmployeeName());
		System.out.println("Employee ID: " + sec.getEmployeeID());
		System.out.println("Employee DOB: " + sec.getDateOfBirth());
		System.out.println("Employee SSN: " + sec.getSsn());
		System.out.println("Employee Address: " + sec.getAddress());
		System.out.println("Total years of work: " + sec.getYearsOfWork());
		System.out.println("Total hours of work per month: " + sec.getHoursPerMonth());
		System.out.println("Current monthly salary: " + sec.calculateSalary());
		
		
	}

}
