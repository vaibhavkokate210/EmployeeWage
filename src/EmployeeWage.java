
public class EmployeeWage {

	public static final int is_Part_Time=2;
	public static final int is_Full_Time=1;
	public static final int Emp_Rate_Per_Hour=20;
	public static final int No_Of_Working_Days=20;
	
	public static void main(String[] args) 
	{
		int empHour=0;
		int empWage=0;
		int totalWage=0;
		
		for(int i=0;i<No_Of_Working_Days;i++)
		{
		      int empCheck=(int)(Math.floor(Math.random()*10)%3);
		
		      switch(empCheck)
		      {
		            case is_Full_Time:empHour=8;
		                              break;
		                  
		            case is_Part_Time:empHour=4;
                                      break;
        
		            default:empHour=0;
		      }
		
		     empWage=empHour*Emp_Rate_Per_Hour;
		     totalWage=totalWage+empWage;
		}
		System.out.println("Employee Total Wage = "+totalWage);
		   
	}

}
