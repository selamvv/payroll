package PayRollProgram;

public class employee
{

	// Instance variables for this class
	    
	private String firstName;
	private String lastName;
	public String jobType;
	public int rate;
	public int hours;
	
	
	//constructor
	public employee(String fname, String lname, String jtype, int rate, int hours)
	{
		this.firstName = fname;
		this.lastName = lname;
		this.jobType = jtype;
		this.hours =hours;
		this.rate=rate;
	}

	/**
	 * @param fistName --first name
	 * @param lastName --last name
	 * @param jobType --employment type-hourly, salary ect.
	 * @param rate --how much an hour they get paid
	 * @param hour --how many hours they worked in a week
	 */
	
	//getters and setters
	
	/**
	 * @return the fistName
	 */
	public String getFistName()
	{
		return firstName;
	}


	/**
	 * @param fistName the fistName to set
	 */
	public void setFistName(String fistName)
	{
		this.firstName = fistName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}


	/**
	 * @return the jobType
	 */
	public String getJobType()
	{
		return jobType;
	}


	/**
	 * @param jobType the jobType to set
	 */
	public void setJobType(String jobType)
	{
		this.jobType = jobType;
	}


	/**
	 * @return the rate
	 */
	public int getRate()
	{
		return rate;
	}

	//set the rate
	public void setRate(int rate)
	{
		this.rate = rate;
	}

	 // return the hour
	 
	public int getHour()
	{
		return hours;
	}

	//set the hours for an employer
	public void setHour(int hour)
	{
		this.hours = hour;
	}
	
	//public static void main(String[] args)
	//{
	//	employee e =new employee("sam", "baldino","contractor", 15, 30);
//		System.out.println("S "+ e);

	//}

	//@Override
	//public String toString()
	//{
	//	return "employee: "+ firstName+ " "+ lastName + ", " + jobType +", " + rate + ", "+ hours;
	//}
}
