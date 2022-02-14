package PayRollProgram;
import java.util.ArrayList;

public class payroll
{
	//list of employee class objects
	private ArrayList<employee> employees = new ArrayList<employee>();
	
	public payroll(ArrayList<employee> employees)
	{
		this.employees=employees;
	}
	
	/**
	 * @return the employees
	 */
	public ArrayList<employee> getEmployees()
	{
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(ArrayList<employee> employees)
	{
		this.employees = employees;
	}

	public void add_emp(String fname, String lname, String jt, int r, int h)
	{
		employee emp = new employee(fname, lname, jt, r, h);
		employees.add(emp);
	}
	
	public ArrayList<Float> payAll()
	{	
		int emp_len=employees.size();
		//array to be filled with amount paid to each employee 
		ArrayList<Float> amt_paid = new ArrayList<Float>();
		float amt;
		int i;
		employee x;
		for (i =0; i<emp_len; i++)
		{
			x= employees.get(i);
			if (x.jobType == "Hourly")
			{
				HourlyEmpPayCalc HE= new HourlyEmpPayCalc();
				amt = HE.pay(x);
			}else if (x.jobType == "Salary"){
				SalaryEmpPayCalac SE = new SalaryEmpPayCalac();
				amt = SE.pay(x);
			} else {
				ContractorEmpPayCalc CE = new ContractorEmpPayCalc();
				amt = CE.pay(x);
			}
			amt_paid.add(amt);
		}
		//return an array of floats
		return amt_paid;
	}
	public static void main(String[] args)
	{
		ArrayList<employee> employees = new ArrayList<employee>();
		payroll p = new payroll(employees);
		
		//ArrayList<employee> employees = new ArrayList<employee>();
		//employees = p.employees;
		p.add_emp("sam", "baldino", "contractor", 15, 30);
		ArrayList<Float> x = p.payAll();
		p.set_hours();
		//System.out.println("employee array size "+ p.employees.size());
		System.out.println("employee salary array of floats: "+ x);
		System.out.println("employee hours reset: "+ p.employees.get(0).getHour());
		System.out.println("after hour reset, employee salary array of floats: "+ p.payAll());
	}
	@Override
	public String toString()
	{
		
		//return String.valueOf(employees.size());
		return String.valueOf(payAll());
	}
	public void set_hours()
	{	int min = 0;//hours floor
    	int max = 80;//hours ceiling 
		int i;		//index
		int emp_len=employees.size();
		for (i =0; i<emp_len; i++)
		{
    	//Generate random int value from 0 to 80 
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		employees.get(i).hours=random_int;
		        }
		  //}
	}
	
}
