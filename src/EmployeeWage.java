
class CompanyEmpWage
{

	public final String company;
	public final int empRatePerHour;
	public final int noOfWorkingDays;
	public final int maxWorkingHour;
	public int totalWage;
	
	public CompanyEmpWage(String company,int empRatePerHour,int noOfWorkingDays,int maxWorkingHour)
	{
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.noOfWorkingDays=noOfWorkingDays;
		this.maxWorkingHour=maxWorkingHour;
	}
     public void setTotalCompanyWage(int totalWage)
     {
    	 this.totalWage+=totalWage;
     }
	@Override
	public String toString() {
		return "company = " + company + ", totalWage = " + totalWage;
	}
	
}
public class EmployeeWage 
{
	public static final int is_Part_Time=2;
	public static final int is_Full_Time=1;
	CompanyEmpWage CompanyArray[];
	static int noOfCompany;
	public EmployeeWage()
	{
		CompanyArray=new CompanyEmpWage[10];
	}
	public void addCompanyEmpWage(String company,int empRatePerHour,int noOfWorkingDays,int maxWorkingHour)
	{
		CompanyArray[noOfCompany++]=new CompanyEmpWage(company,empRatePerHour,noOfWorkingDays,maxWorkingHour);
		
	}
	public void computeEmpWage()
	{
		for(int i=0;i<noOfCompany;i++)
		{
			CompanyArray[i].setTotalCompanyWage(calculateEmployeeWage(CompanyArray[i]));
			System.out.println(CompanyArray[i]);
		}
	}
	public int calculateEmployeeWage(CompanyEmpWage cew)
	{
		int empHour=0;
		int totalHour=0;
		int totalworkingDays=0;
		
		while(totalHour<cew.maxWorkingHour && totalworkingDays<cew.noOfWorkingDays)
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
		return (totalHour*cew.empRatePerHour);
		
	}
	public static void main(String[] args) 
	{
		EmployeeWage obj=new EmployeeWage();
		obj.addCompanyEmpWage("TCS", 20, 20, 150);
		obj.addCompanyEmpWage("Accenture", 30, 20, 250);
		obj.computeEmpWage();
	}

}
