package PayRollProgram;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class payRoleTest
{
	payroll p;

	@BeforeEach
	void setUp() throws Exception
	{
		
		ArrayList<employee> employees = new ArrayList<employee>();
		p = new payroll(employees);
		
	}

	@Test
	void testPayRoll()
	{	
		p.add_emp( "sam","baldino", "contractor", 15, 30);
		assertEquals(p.getEmployees().size(), 1);
		assertEquals(p.payAll(), 450.0 );
		p.set_hours();
		assertEquals(p.getEmployees().get(0), p.getEmployees().get(0).getHour());
	}
	

}
