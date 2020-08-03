interface EmployeeWage
{
	 void dailyWage();
}

class wageCal implements EmployeeWage
{
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	public static final int empRatePerHrs=20;
	int empHrs=0;
	int empWage=0;

	int empCheck = (int) Math.floor(Math.random()*10)%3;
	
	public void dailyWage()
	{
		switch (empCheck)
		{
			case isFullTime :
				System.out.println("Employee is full time working");
				empHrs = 8;
				break;

			case isPartTime :
				System.out.println("Employee is part time working");
				empHrs = 4;
				break;

			default :
				System.out.println("Employee is Absent");
				empHrs = 0;
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
