interface EmployeePresent
{
	 void empChk();
}

class empCheck implements EmployeePresent
{
	static final int isFullTime=1;
	double empCheck = Math.floor(Math.random()*10)%2;
	public void empChk()
	{
		if (empCheck == isFullTime)
			System.out.println("Employee is Present");

		else
			System.out.println("Employee is Absent");		
	}
}

class EmployeeWageBuilder
{
	public static void main(String arg[])
	{
		empCheck rm = new empCheck();
		rm.empChk();
	}
}
