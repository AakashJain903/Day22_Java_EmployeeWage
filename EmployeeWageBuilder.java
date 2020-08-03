interface EmployeeWage
{
	public void wageComputation(int empRatePerHrs);
	public void displayTotalWage(String company);
	public void dailyWage(String company, int empRatePerHrs);
}

class wageCal implements EmployeeWage
{
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	public static final int numOfWorkingDays=20;
	public static final int totalHrsInMonth=100;
	int empHrs=0;
	int empWage=0;
	int totalWage=0;
	int totalWorkingDay=0;
	int totalWorkingHrs=0;

	public void wageComputation(int empRatePerHrs)
	{
		empWage = empHrs * empRatePerHrs ;
		totalWage += empWage;
		totalWorkingHrs += empHrs;
		//System.out.println("Employee's day "+ totalWorkingDay +" Wage is : " + empWage);
	}

	public void displayTotalWage(String company)
	{
		System.out.println("Wage Calculation for :" + company);
		System.out.println("Total working Hours in month : " + totalWorkingHrs);		
   		System.out.println("Total Monthly wages is :" + totalWage);
	}
	public void dailyWage(String company, int empRatePerHrs)
	{
		while ( totalWorkingDay < numOfWorkingDays && totalWorkingHrs < totalHrsInMonth )
		{
			totalWorkingDay++;
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
			switch (empCheck)
			{
				case isFullTime :
					empHrs = 8;
					break;

				case isPartTime :
					empHrs = 4;
					break;

				default :
					empHrs = 0;
			}
			wageComputation(empRatePerHrs);
		}
		displayTotalWage(company);
	}	
}

class EmployeeWageBuilder
{
	public static void main(String arg[])
	{
		wageCal wage1 = new wageCal();
		wageCal wage2 = new wageCal();
		wage1.dailyWage("Reliance Fresh",20);
		wage2.dailyWage("Dmart",20);
	}
}
