package lesson5.question1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof1 = new Professor("Olivia Pope", 5000.00, LocalDate.of(2010, Month.APRIL, 23), 5 );
		Professor prof2 = new Professor("Matt Bomer", 5250.00, LocalDate.of(2011, Month.AUGUST, 23), 8 );
		Professor prof3 = new Professor("Zac Efron", 5950.00, LocalDate.of(2012, Month.JUNE, 3), 10 );
		
		Secretary sec1 = new Secretary("Annalise Keating", 3500.00, LocalDate.of(2008, Month.MAY, 11), 2.5);
		Secretary sec2 = new Secretary("Meredith Grey", 3250.00, LocalDate.of(2009, Month.NOVEMBER, 8), 1.5);
		
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0] = prof1;
		department[1] = prof2;
		department[2]= prof3;
		department[3] = sec1;
		department[4] = sec2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you wish to see all the salary of Professors, Secretaries, and all employess? (Y/N): ");
		char ans = sc.next().charAt(0);
		
		if(ans == 'Y' || ans == 'y')
		{
			double profSalary = 0.0, secSalary = 0.0, depSalary = 0.0;
			for(DeptEmployee depEmp: department)
			{
				if(depEmp instanceof Professor)
					profSalary = profSalary + depEmp.computeSalary();
				else
					secSalary = secSalary + depEmp.computeSalary();
			}
			depSalary = (profSalary + secSalary);
			
			System.out.println("All the Professor's salary is: " + profSalary);
			System.out.println("All the Secretary's salary is: " + secSalary);
			System.out.println("In total all the Department's salary is: " + depSalary);
		}
		else
		{
			System.out.println("You do not wish to see the salary.");
		}
		
		sc.close();

	}

}
