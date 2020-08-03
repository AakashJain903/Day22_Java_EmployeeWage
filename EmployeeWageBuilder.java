interface PartTimeEmp
{
	 void dailyWage();
}

class wageCal implements PartTimeEmp
{
	static final int isFullTime=1;
	static final int isPartTime=2;
	static final int empRatePerHrs=20;
	int empHrs=0;
	int empWage=0;

	double empCheck = Math.floor(Math.random()*10)%3;
	
	public void dailyWage()
	{
		if (empCheck == isFullTime)
		{
			System.out.println("Employee is full time");
			empHrs=12;
		}
		else if (empCheck == isPartTime) 
		{
			System.out.println("Employee is part time");
			empHrs=8;
		}
		else
		{
			System.out.println("Employee is Absent");		
			empHrs=0;
		}

		empWage = empHrs * empRatePerHrs;
		System.out.println("Employee's Daily Wage is :" + empWage);
	}
}

class EmployeeWageBuilder
{
	public static void main(String arg[])
	{
		wageCal wage = new wageCal();
		wage.dailyWage();
	}
}
