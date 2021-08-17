
public class EmployeeWage 
{
	public static final int is_Part_Time=2;
	public static final int is_Full_Time=1;
	public final String company;
	public final int empRatePerHour;
	public final int noOfWorkingDays;
	public final int maxWorkingHour;
	public int totalWage;
	
	public EmployeeWage(String company,int empRatePerHour,int noOfWorkingDays,int maxWorkingHour)
	{
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.noOfWorkingDays=noOfWorkingDays;
		this.maxWorkingHour=maxWorkingHour;
	}
	public void calculateEmployeeWage()
	{
		int empHour=0;
		int totalHour=0;
		int totalworkingDays=0;
		
		while(totalHour<maxWorkingHour && totalworkingDays<noOfWorkingDays)
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
		}
		System.out.println("Total Employee wages for company "+company+" = "+(totalWage=totalHour*empRatePerHour));
		
	}
	public static void main(String[] args) 
	{
		EmployeeWage dmart=new EmployeeWage("Dmart",10,22,200);
		EmployeeWage tcs=new EmployeeWage("TCS",15,22,200);
		dmart.calculateEmployeeWage();
		tcs.calculateEmployeeWage();
	}

}
