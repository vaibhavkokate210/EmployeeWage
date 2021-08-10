
public class EmployeeWage {

	public static final int is_Part_Time=2;
	public static final int is_Full_Time=1;
	public static final int Emp_Rate_Per_Hour=20;
	public static final int No_Of_Working_Days=20;
	public static final int Max_working_Hour=100;
	
	public static void main(String[] args) 
	{
		int empHour=0;
		int totalWage=0;
		int totalHour=0;
		int totalworkingDays=0;
		
		while(totalHour<Max_working_Hour && totalworkingDays<No_Of_Working_Days)
		{
		      int empCheck=(int)(Math.floor(Math.random()*10)%3);
		      totalworkingDays++;
		      switch(empCheck)
		      {
		            case is_Full_Time:empHour=8;
		                              break;
		                  
		            case is_Part_Time:empHour=4;
                                      break;
        
		            default:empHour=0;
		      }
		
	         totalHour+=empHour;
	         System.out.println("Day = "+totalworkingDays+ "  Hour = "+empHour);
		}
		totalWage=totalHour*Emp_Rate_Per_Hour;
		System.out.println("Employee Total Wage = "+totalWage);
		   
	}

}
