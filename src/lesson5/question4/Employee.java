package lesson5.question4;

import java.util.Date;

public interface Employee {
	int BASE_SALARY = 10;
	int BONUS = 2;
	int EXTRA_HOURS = 15;
	
	void getEmployeeDetails();
	double calculateSalary();
}
