interface EmployeeWage
{
	 void dailyWage();
}

class wageCal implements EmployeeWage
{
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	public static final int empRatePerHrs=20;
	public static final int numOfWorkingDays=20;
	public static final int totalHrsInMonth=100;
	int empHrs=0;
	int empWage=0;
	int totalWage=0;
	int totalWorkingDay=0;
	int totalWorkingHrs=0;

	public void wageComputation()
	{
		empWage = empHrs * empRatePerHrs ;
		totalWage += empWage;
		totalWorkingHrs += empHrs;
		System.out.println("Employee's day "+ totalWorkingDay +" Wage is : " + empWage);
	}

	public void displayTotalWage()
	{
		System.out.println("Total working Hours in month : " + totalWorkingHrs);		
   		System.out.println("Total Monthly wages is :" + totalWage);
	}
	public void dailyWage()
	{
		while ( totalWorkingDay < numOfWorkingDays && totalWorkingHrs < totalHrsInMonth )
		{
			totalWorkingDay++;
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
			wageComputation();
		}
		displayTotalWage();
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
