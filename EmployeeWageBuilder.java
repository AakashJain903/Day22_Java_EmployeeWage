interface EmpDailyWage
{
	 void dailyWage();
}

class wageCal implements EmpDailyWage
{
	static final int isFullTime=1;
	static final int empRatePerHrs=20;
	int empHrs=0;
	int empWage=0;

	double empCheck = Math.floor(Math.random()*10)%2;
	
	public void dailyWage()
	{
		if (empCheck == isFullTime)
		{
			System.out.println("Employee is Present");
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
