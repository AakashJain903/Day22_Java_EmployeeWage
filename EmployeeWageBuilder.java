interface EmployeeMonthWage
{
	 void dailyWage();
}

class wageCal implements EmployeeMonthWage
{
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	public static final int empRatePerHrs=20;
	public static final int numOfWorkingDays=20;
	int empHrs=0;
	int empWage=0;
	int totalWage=0;

	public void dailyWage()
	{
		for (int day=1; day<=numOfWorkingDays; day++)
		{
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
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

			empWage = empHrs * empRatePerHrs ;
			totalWage += empWage;
			System.out.println("Employee's day "+ day +" Wage is : " + empWage);
		}		
   		System.out.println("Total Monthly wages is :" + totalWage);
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
