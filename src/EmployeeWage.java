
public class EmployeeWage {

	public static void main(String[] args) 
	{
		int is_Present=1;
		int Emp_Rate_Per_Hour=20;
		int empHour=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(is_Present==empCheck)
		   empHour=8;
		else
		    empHour=0;
		
		empWage=empHour*Emp_Rate_Per_Hour;
		System.out.println("Employee Daily Wage = "+empWage);
		   
	}

}
