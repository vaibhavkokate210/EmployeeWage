
public class EmployeeWage {

	public static void main(String[] args) 
	{
		int is_Part_Time=2;
		int is_Full_Time=1;
		int Emp_Rate_Per_Hour=20;
		int empHour=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		if(is_Full_Time==empCheck)
		   empHour=8;
		else if(is_Part_Time==empCheck)
			empHour=4;
		else
		    empHour=0;
		
		empWage=empHour*Emp_Rate_Per_Hour;
		System.out.println("Employee Daily Wage = "+empWage);
		   
	}

}
