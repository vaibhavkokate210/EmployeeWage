
public class EmployeeWage {

	public static void main(String[] args) 
	{
		int is_Present=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(is_Present==empCheck)
			System.out.println("Employee is present");
		else
			System.out.println("Emplyoee is Absent");
	}

}
