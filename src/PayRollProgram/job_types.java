package PayRollProgram;

public interface job_types
{ 
	//abstract methods
	public float pay(employee emp);
}

class HourlyEmpPayCalc implements job_types
{
	float total;
	float rate;
	float hours;
	@Override
	public float pay(employee emp)
	{
		this.rate=emp.rate;
		this.hours=emp.hours;
		//calculate the paycheck for hourly employees
		
		if (emp.hours>=40.0) 
		 {
			 total=hours*rate;
	     
		 } else{
	    	 total= (float) ((40.0*rate) + (1.5*rate)*(hours-40.0));
		 	}
	    return total;	 
		 
	}
}

class ContractorEmpPayCalc implements job_types
{
	float total;
	float rate;
	float hours;
	@Override
	public float pay(employee emp) {
		//calculate the paycheck for hourly employees
		this.rate=emp.rate;
		this.hours=emp.hours;
		this.total= hours*rate;
		return this.total;
	}
}


class SalaryEmpPayCalac implements job_types
{	
	
	float total;
	float rate;
	@Override
	public float pay(employee emp) {
		//calculate the paycheck for hourly employees
		this.rate=emp.rate;
		total= 40*emp.rate;
		return total;
	}

}

	